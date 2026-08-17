public class ifelseprictice2 {
    public static void main(String[]args){
        /*
         0-30000 = low income;
         30001- 60000 = average income;
         60001- 90000= above average income;
         90001-100000= high income;
         design a system that take input and return in the income level
         */
        int income = 55000;

        if(income>=0 && income<=30000){
            System.out.println("low income");
        }else if(income>=30001 && income<=60000){
            System.out.println("average income");
        }else if(income>=60001 && income<=90000){
            System.out.println("above average income");
        }else if (income>=90001 && income <=100000){
            System.out.println("high income");
        }else {
            System.out.println("wrong income");
        }

    }
}
