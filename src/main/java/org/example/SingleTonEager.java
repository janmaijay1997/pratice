package org.example;

public class SingleTonEager {

    private static SingleTonEager singleTonEager=new SingleTonEager();

    private SingleTonEager(){

    }

    public  static SingleTonEager getInstance(){
        return singleTonEager;
    }
}
