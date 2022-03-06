package com.company;

// use of printf() or format() to generate output
public class Gfg_TakingOutputMethod2 {
    public static void main(String[] args) {
        int x=100; int y=200;
        System.out.format("Value of x is %d \n", x);
        float z = (float)Math.PI;
        System.out.println(z);
        System.out.format("Value of PI = %.2f \n", z);
        System.out.format("Value of PI = %5.2f\n",z);
        System.out.format("Value of PI = %05.2f\n",z);
        System.out.printf("x=%d,y=%d",x,y);

    }
}

