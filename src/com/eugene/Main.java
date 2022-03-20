package com.eugene;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOfStudents,Cat,MainExam,Total;
        String Name;
        char grade;
        Scanner input=new Scanner(System.in);
        System.out.print("Number of Students: ");
        numberOfStudents=input.nextInt();

        String [] name=new String[numberOfStudents];
        int [] catMarks=new int[numberOfStudents];
        int [] Main=new int[numberOfStudents];
        int [] TotalMArks=new int[numberOfStudents];
        char [] Grade=new char[numberOfStudents];

        for (int i=0;i<numberOfStudents;i++) {
            System.out.print("Name of student " + (i + 1) + ": ");
            Name = input.next();
            name[i] = Name;

            System.out.print("Cat Marks of student " + (i + 1) + ": ");
            Cat = input.nextInt();
            catMarks[i] = Cat;

            if (Cat > 30 || Cat < 0) {
                System.out.println("Error");
                break;

            } else {

            System.out.print("Main exam marks of student " + (i + 1) + ": ");
            MainExam = input.nextInt();
            Main[i] = MainExam;

            if (MainExam>70 || MainExam<0){
                System.out.println("Error");
                break;
            }else {

                Total = Cat + MainExam;
                TotalMArks[i] = Total;

                if (Total >= 70) {
                    grade = 'A';
                    Grade[i] = grade;

                } else if (Total >= 60) {
                    grade = 'B';
                    Grade[i] = grade;
                } else if (Total >= 50) {
                    grade = 'C';
                    Grade[i] = grade;
                } else if (Total >= 40) {
                    grade = 'D';
                    Grade[i] = grade;
                } else {
                    grade = 'F';
                    Grade[i] = grade;
                }
            }
        }
        }

        for (int j=0;j<numberOfStudents;j++){
            System.out.println("Name: "+name[j]+" Cat: "+catMarks[j]+" Main Exam: "+Main[j]+" Total: "+TotalMArks[j]
           +" Grade: "+Grade[j] );
        }

    }
}
