public class practiceall {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int age = 12;
        String name = "Stephen";
        double salary = 200.25;
        double tax = 70.24;
        boolean dicision = true;
        char initiate = '$';
        System.out.println(salary);
        salary = 220.25;
        System.out.println(salary);


        int allan = 50;
        int stev = 40;
        int jema = 35;
        System.out.println(allan + stev + jema);
        System.out.println(allan - jema);
        System.out.println(allan * stev);
        System.out.println(allan / stev);
        System.out.println(allan % stev);
        System.out.println(allan++);
        System.out.println(allan--);


        int james = 10;
        int jhon = 5;
        int ethan = 10;
        System.out.println(james > jhon);
        System.out.println(james < jhon);
        System.out.println(james == jhon);
        System.out.println(jhon <= ethan);
        System.out.println(ethan >= jhon);
        System.out.println(ethan != james);


        String participation1 = ("NY");
        String participation2 = ("CA");

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        String outsideCondition = "Rainy";
        if (outsideCondition == "Sunny") {
            System.out.println("Lets go");
        } else {
            System.out.println("Stay home");
        }
    }
}