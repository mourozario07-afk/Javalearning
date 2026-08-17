package quizpractice10;

public class insuranceprimium10 {
    //Write a program to determine the cost of an automobile insurance premium, based on the number of accidents occurred by drivers.
//The basic insurance charge is $500.
    public static void main(String[]args) {
        int accidents = 2;
        int premium = 500;

        if (accidents == 1)
            premium += 50;
        else if (accidents == 2)
            premium += 120;
        else if (accidents == 3)
            premium += 220;
        else if (accidents == 4)
            premium += 370;
        else if (accidents == 5)
            premium += 570;
        else if (accidents >= 6) {
            System.out.println("No insurance");
            return;
        }

            System.out.println("Insurance Premium = $" + premium);



    }

    }


