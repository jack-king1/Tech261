package com.sparta.jk;

public interface Teachable2 {
    default void teach(){
        System.out.println("2");
    }
}
