/*
 * Copyright (C) 2010 Cyril Mottier (http://www.cyrilmottier.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.foxykeep.greendroidlight.util;

import java.util.concurrent.ExecutorService;

import android.content.Context;

import com.foxykeep.greendroidlight.GDApplicationInterface;
import com.foxykeep.greendroidlight.image.ImageCache;

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
     * @return The application( which implements {@link GDApplicationInterface}) the given context is linked to.
     */
    public static GDApplicationInterface getTickengoApplication(final Context context) {
        return (GDApplicationInterface) context.getApplicationContext();
    }

    /**
     * Return the {@link GDApplicationInterface} image cache
     * 
     * @param context The calling context
     * @return The image cache of the current {@link GDApplication}
     */
    public static ImageCache getImageCache(final Context context) {
        return getTickengoApplication(context).getImageCache();
    }

    /**
     * Return the {@link GDApplicationInterface} executors pool.
     * 
     * @param context The calling context
     * @return The executors pool of the current {@link GDApplication}
     */
    public static ExecutorService getExecutorService(final Context context) {
        return getTickengoApplication(context).getExecutorService();
    }

}
