package me.yoonhc.springbootstudy.domain;


import me.yoonhc.springbootstudy.annotation.MyAnnotation;


public class Book2 {
    public static String A = "A";

    private String B = "B";

    public Book2(String b) {
        B = b;
    }

    private void c(){
        System.out.println("C");
    }

    public int d(int left, int right){
        return left + right;
    }
}
