package com.bridglabz.basics;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int temp=0;
        int num=10;
        for (int i=0;i<num;i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.println(temp);
        }
    }
}
