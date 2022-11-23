package com.bridglabz.basics;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count=0;
        int number =2;
        for (int i=1;i<=number;i++){
            if (number%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Number is prime number");
        }else {
            System.out.println("Number is not prime number");
        }
    }
}
