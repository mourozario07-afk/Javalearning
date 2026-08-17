package quizpractice10;

public class employeebonus8 {

    //In a company everyone gets a $10000 salary. The company decided to give a bonus of 5% to employees if his/her year of service is more than 5 years, 10% for more than 10 years, 30% for more than 15 years.
public static void main(String[]args){

    double salary = 10000;
    int years = 10;

    if (years > 15) {
        salary += salary * 0.30;
    } else if (years > 10) {
        salary += salary * 0.10;
    } else if (years > 5) {
        salary += salary * 0.05;
    }

    System.out.println("Total Salary = $" + salary);
}
}


