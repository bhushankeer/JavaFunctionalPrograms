package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonants {


        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a character : ");
            char ch=scanner.next().charAt(0);
            scanner.close();
            //rchar ch = 'b';

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                System.out.println(ch + " is vowel");
            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            System.out.println(ch + " is vowel");
            else
                System.out.println(ch + " is consonant");

        }
    }
