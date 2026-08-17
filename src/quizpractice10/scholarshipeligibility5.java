package quizpractice10;

public class scholarshipeligibility5 {
    //Write a program that takes a student's GPA and family income as input from the user. Set minimum GPA and income thresholds for eligibility. Use if-else statements to check if the student is eligible for a scholarship based on both criteria and print a message accordingly.
public static void main(String[]args){

    double gpa = 3.8;
    double income = 50000;

    if (gpa >= 3.5 && income <= 40000) {
        System.out.println("Eligible for scholarship");
    } else {
        System.out.println("Not eligible");
    }


}
}
