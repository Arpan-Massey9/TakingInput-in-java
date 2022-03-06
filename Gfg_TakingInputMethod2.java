package com.company;
import java.util.*;
public class Gfg_TakingInputMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String name = sc.nextLine();
        System.out.println("You Entered "+name);
        System.out.println("enter integer:");
        int i = sc.nextInt();
        System.out.println("You Entered "+ i);
        System.out.println("Enter boolean value:");
        boolean b = sc.hasNextBoolean();
        System.out.println("You Entered "+ b);
    }
}
