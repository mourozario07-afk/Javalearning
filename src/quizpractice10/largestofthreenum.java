package quizpractice10;

public class largestofthreenum {
   //Write a program that takes three numbers as input from the user. Use a series of if-else if statements to find and print the largest number among the three.
public static void main(String[]args){

    int a =10;
    int b = 30;
    int c = 5;

    if (a >= b && a >= c) {
        System.out.println("Largest = " + a);
    } else if (b >= c) {
        System.out.println("Largest = " + b);
    } else {
        System.out.println("Largest = " + c);
    }
}



}
