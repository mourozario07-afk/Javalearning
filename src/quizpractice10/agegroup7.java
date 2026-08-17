package quizpractice10;

public class agegroup7 {
    //Write a program that takes a person's age as input from the user. Define different age groups (e.g., child: 0-12, teenager: 13-19, adult: 20+). Use if-else if statements to categorize the age group and print the corresponding message.
public static void main(String[]args){

    int age = 46;

    if (age <= 12) {
        System.out.println("Child");
    } else if (age <= 19) {
        System.out.println("Teenager");
    } else {
        System.out.println("Adult");
    }

}
}
