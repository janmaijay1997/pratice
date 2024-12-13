package org.example;

public class SingleTonLazy {

    private static SingleTonLazy singleTonLazy=null;

    private SingleTonLazy(){

    }

    public  static SingleTonLazy getInstance(){
        if(singleTonLazy==null){
            singleTonLazy=new SingleTonLazy();
        }
        return singleTonLazy;
    }
}
