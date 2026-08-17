package quizpractice10;

public class leapyear {
    //Write a program that takes a year as input from the user and checks if it's a leap year. A year is a leap year if it's divisible by 4 but not by 100, or if it's divisible by 400. Print "Leap year" or "Not a leap year" based on the check.
public static void main(String[]args){
int year=401;

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        System.out.println("Leap year");
    } else {
        System.out.println("Not a leap year");
    }



}










}
