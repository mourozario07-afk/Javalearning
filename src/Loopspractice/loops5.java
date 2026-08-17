package Loopspractice;

public class loops5 {
    public static void main(String[]args){
        //reverse a number
        //
        //Example: 1234 → 4321

         int number = 1234;
        int reverse = 0;

        while (number != 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;

        }

        System.out.println("Reversed Number = " + reverse);




    }
}
