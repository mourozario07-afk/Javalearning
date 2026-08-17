package quizpractice10;

public class multiaplicationtable11 {
    //Write a program that takes a number as input from the user and prints its multiplication table up to a specific limit (also taken from the user). Use a for loop to iterate through the numbers and an if statement to print the product of each number with the given number.
public static void main(String[]args){


    int num = 12;
    int limit = 10;

    for (int i = 1; i <= limit; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
    }
}

}
