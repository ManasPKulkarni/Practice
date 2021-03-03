package com.devSense.welcome;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{

    private Singleton(){}
    
    private static class SingletonHolder {
    	private static final Singleton INSTANCE = new Singleton();
    }
        
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
