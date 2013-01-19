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

package com.foxykeep.greendroidlight.util;

import android.content.Context;

import com.foxykeep.greendroidlight.GDApplicationInterface;
import com.foxykeep.greendroidlight.image.ImageCache;

import java.util.concurrent.ExecutorService;

/**
 * Class that provides several utility methods related to GreenDroid.
 *
 * @author Cyril Mottier
 */
public class GDUtils {

    private GDUtils() {
    }

    /**
     * Return the current application which implements {@link GDApplicationInterface}
     *
     * @param context The calling context
     * @return The application( which implements {@link GDApplicationInterface}) the given context
     *         is linked to.
     */
    public static GDApplicationInterface getGDApplicationInterface(final Context context) {
        return (GDApplicationInterface) context.getApplicationContext();
    }

    /**
     * Return the {@link GDApplicationInterface} image cache
     *
     * @param context The calling context
     * @return The image cache of the current {@link GDApplication}
     */
    public static ImageCache getImageCache(final Context context) {
        return getGDApplicationInterface(context).getImageCache();
    }

    /**
     * Return the {@link GDApplicationInterface} executors pool.
     *
     * @param context The calling context
     * @return The executors pool of the current {@link GDApplication}
     */
    public static ExecutorService getExecutorService(final Context context) {
        return getGDApplicationInterface(context).getExecutorService();
    }

}
