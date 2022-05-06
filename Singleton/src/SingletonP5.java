
package com.adam.app;

public class SingletonP5 {

    private static volatile SingletonP5 sInstance;
    
    private SingletonP5() {}
    
    public static SingletonP5 getInstance() {
        if (sInstance == null) {
            synchronized (SingletonP5.class) {
                if (sInstance == null) {
                    sInstance = new SingletonP5();
                }
            }
        }
        return sInstance;
    }
    
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */
