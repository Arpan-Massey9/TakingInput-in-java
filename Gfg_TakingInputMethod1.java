package com.company;
import java.io.*;
import java.util.*;
import java.math.*;

public class Gfg_TakingInputMethod1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String s = br.readLine();
        System.out.println("You Entered "+ s);

    }
}
