
package com.adam.app;

public class SingletonP1 {

    private static SingletonP1 sInstance;
    
    private SingletonP1() {}
    
    public static SingletonP1 getInstance() {
        
        if (sInstance == null) {
            sInstance = new SingletonP1();
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
