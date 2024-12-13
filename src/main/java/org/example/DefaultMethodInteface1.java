package org.example;

public interface DefaultMethodInteface1 {

    default int test(int d){
        return 1;
    }
    static void testfd(){
        System.out.println("testffff");
    }
}
