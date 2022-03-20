package com.eugene;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int age;
        String name,Color;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Name: ");
        name=scanner.next();
        System.out.print("Age: ");
        age=scanner.nextInt();
        System.out.print("Color: ");
        Color=scanner.next();


        System.out.println(name+" of age "+ age+" like color "+Color);
    }
}
