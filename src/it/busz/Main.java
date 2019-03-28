package it.busz;

import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (;num>0;num--){
            int number = input.nextInt();
            System.out.println(factorial(BigInteger.valueOf(number)).toString());
        }
    }

    private static BigInteger factorial(BigInteger number){
        if(number.equals(BigInteger.valueOf(1)))
            return number;
        else
            return number.multiply(factorial(number.subtract(BigInteger.valueOf(1))));
    }
}

