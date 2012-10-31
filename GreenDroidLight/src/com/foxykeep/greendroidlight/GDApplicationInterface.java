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

package com.foxykeep.greendroidlight;

import com.foxykeep.greendroidlight.image.ImageCache;

import java.util.concurrent.ExecutorService;

public interface GDApplicationInterface {

    public ImageCache getImageCache();

    public ExecutorService getExecutorService();

    public void registerOnLowMemoryListener(OnLowMemoryListener listener);

    public void unregisterOnLowMemoryListener(OnLowMemoryListener listener);
}
