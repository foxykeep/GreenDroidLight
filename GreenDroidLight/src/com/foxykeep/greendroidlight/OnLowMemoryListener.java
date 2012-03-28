package com.foxykeep.greendroidlight;

/**
 * Used for receiving low memory system notification. You should definitely use it in order to clear caches and not important data every time the
 * system needs memory.
 * 
 * @author Cyril Mottier
 * @see GDApplication#registerOnLowMemoryListener(OnLowMemoryListener)
 * @see GDApplication#unregisterOnLowMemoryListener(OnLowMemoryListener)
 */
public interface OnLowMemoryListener {

    /**
     * Callback to be invoked when the system needs memory.
     */
    public void onLowMemoryReceived();
}
