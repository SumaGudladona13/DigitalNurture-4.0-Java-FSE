package com.p1;

public class Main 
{
    public static void main(String[] args) 
    {
    	// TODO Auto-generated method stub
        Logger l1=Logger.getL1();
        Logger l2=Logger.getL1();
        l1.message("This is the first log message.");
        l2.message("This is the second log message.");
        if (l1==l2) 
        {
            System.out.println("Singleton is verified, as there are 2 same Loggers.");
        } 
        else 
        {
            System.out.println("Singleton Failed, as the Logger instances are different.");
        }
    }
}

