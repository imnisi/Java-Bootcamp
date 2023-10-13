//Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below.
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail


import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        grades(marks);
    }

    static void grades(int marks){
        if(marks >= 91)
            System.out.print("Grade: "+"AA");
        else if (marks >= 81)
            System.out.print("Grade: "+"AB");
        else if (marks >= 71)
            System.out.print("Grade: "+"BB");
        else if (marks >= 61)
            System.out.print("Grade: "+"BC");
        else if (marks >= 51)
            System.out.print("Grade: "+"CD");
        else if (marks >= 41)
            System.out.print("Grade: "+"DD");
        else
            System.out.print("Grade: "+"Fail");

    }
}

