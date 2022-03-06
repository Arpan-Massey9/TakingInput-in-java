package com.company;
import java.util.*;
import java.io.*;
import java.math.*;
public class Gfg_TakinginputMethod1_integer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the integer:");
        int x = Integer.parseInt(br.readLine());
        System.out.println("You Entered " + x );
    }
}
