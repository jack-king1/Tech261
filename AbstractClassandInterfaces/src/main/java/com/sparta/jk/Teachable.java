package com.sparta.jk;

public interface Teachable {
    default void teach(){
        System.out.println("teaching1");
    }
}
