package com.icarocosta.singleton;

public class Singleton {
    private static Singleton INSTANCE = null;
    String nome, email;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
