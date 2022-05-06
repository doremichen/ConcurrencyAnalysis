
package com.adam.app;

public class SingletonP3 {

    private static volatile SingletonP3 sInstance;
    
    private SingletonP3() {}
    
    public static synchronized SingletonP3 getInstance() {
        if (sInstance == null) {
            sInstance = new SingletonP3();
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
