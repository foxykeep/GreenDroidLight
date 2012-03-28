package com.foxykeep.greendroidlight;

import java.util.concurrent.ExecutorService;

import com.foxykeep.greendroidlight.image.ImageCache;

public interface GDApplicationInterface {

    public ImageCache getImageCache();

    public ExecutorService getExecutorService();

    public void registerOnLowMemoryListener(OnLowMemoryListener listener);

    public void unregisterOnLowMemoryListener(OnLowMemoryListener listener);
}
