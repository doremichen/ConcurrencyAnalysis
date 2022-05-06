
package com.adam.app;

public class SingletonP4 {

    private static volatile SingletonP4 sInstance;
    
    private SingletonP4() {}
    
    public static SingletonP4 getInstance() {
        synchronized(SingletonP4.class) {
            if (sInstance == null) {
                sInstance = new SingletonP4();
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
