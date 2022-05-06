
package com.adam.app;

public class SingletonP2 {

    private static SingletonP2 sInstance;
    
    private SingletonP2() {}
    
    public static synchronized SingletonP2 getInstance() {
        if (sInstance == null) {
            sInstance = new SingletonP2();
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
