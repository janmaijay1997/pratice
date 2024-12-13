package org.example;

public interface ChildInteface extends ParentInteface {
    default  void test(){
        System.out.println("test child");
    }
}