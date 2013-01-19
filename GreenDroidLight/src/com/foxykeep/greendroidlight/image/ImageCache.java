/**
 * <pre>
 * 2012 Foxykeep (http://www.foxykeep.com)
 *
 * Based on the project GreenDroid by Cyril Mottier (http://www.cyrilmottier.com)
 *
 * Original License :
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * </pre>
 */

package com.foxykeep.greendroidlight.image;

import android.content.Context;
import android.graphics.Bitmap;

import com.foxykeep.greendroidlight.OnLowMemoryListener;
import com.foxykeep.greendroidlight.util.GDUtils;

import java.lang.ref.SoftReference;
import java.util.HashMap;

/**
 * A very basing implementation of an Bitmap cache
 *
 * @author Cyril Mottier
 */
public class ImageCache implements OnLowMemoryListener {

    private final HashMap<String, SoftReference<Bitmap>> mSoftCache;

    public ImageCache(final Context context) {
        mSoftCache = new HashMap<String, SoftReference<Bitmap>>();
        GDUtils.getGDApplicationInterface(context).registerOnLowMemoryListener(this);
    }

    public static ImageCache from(final Context context) {
        return GDUtils.getImageCache(context);
    }

    public Bitmap get(final String url) {
        final SoftReference<Bitmap> ref = mSoftCache.get(url);
        if (ref == null) {
            return null;
        }

        final Bitmap bitmap = ref.get();
        if (bitmap == null) {
            mSoftCache.remove(url);
        }

        return bitmap;
    }

    public void put(final String url, final Bitmap bitmap) {
        mSoftCache.put(url, new SoftReference<Bitmap>(bitmap));
    }

    public void flush() {
        mSoftCache.clear();
    }

    public void onLowMemoryReceived() {
        flush();
    }
}
