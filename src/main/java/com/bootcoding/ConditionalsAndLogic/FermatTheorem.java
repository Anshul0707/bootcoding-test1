package com.bootcoding.ConditionalsAndLogic;

public class FermatTheorem
{
    public static void main(String[] args)
    {
        fermatTheorem(3,4,5,3);
    }

    public static void fermatTheorem(int a, int b, int c, int n)
    {
//        int a=Math.pow(a,n);
//        a2+b2=c2
        // d = a2+b2
        // e = c2
        // d == e

        double d=Math.pow(a,n)+ Math.pow(b,n);
        double e=Math.pow(c,n);
        System.out.println(d);
        System.out.println(e);
        if (n>2 && d==e)
        {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else
        {
            System.out.println("No, that doesn’t work.");
        }
    }
}
