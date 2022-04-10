package com.company;

public class Main
{

    public static void main(String[] args)
    {
	double balance = 5000;
    double rate = 1.17;

    System.out.println("your initial balance is " + balance + "$");
    System.out.println("your balance after one moth will be " + (balance * rate) + "$");
    System.out.println("your balance after two months will be " + (balance * rate) * rate + "$");
    
    }
}
