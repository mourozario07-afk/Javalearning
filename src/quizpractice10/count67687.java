package quizpractice10;

public class count67687 {
    //Count the total number of digits in 67687
    public static void main(String[]args){
        int number = 67687;
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Total digits = " + count);
    }

    }




