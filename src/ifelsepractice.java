public class ifelsepractice {
    public static void main(String[]args){

               /*
 0-9 full price
 10-19 you get 10% discount
 20-99 you get 15% discount
 100 or more 20% discounts


if you buy 15 tables priced at $75 each.
What will be the correct total price before tax and shipping?
  */

    int quantity=15;
    double price=75;
    double total;
    double discount=0;
    if(quantity>=0 && quantity<9){
        System.out.println("full price");

    } else if (quantity>= 10 && quantity<=19){
        System.out.println(".10 discount");
        }
    else if (quantity>=20 && quantity<=99){
        System.out.println(".15 discount");
        }
     else if (quantity>=100)
    {
        System.out.println(".20 discount");
        }else {
        System.out.println("no discount");
    }
   //total=total- (total*discount)
        total=1125;
                discount= .10;
total =15*75- (1125*.10);
       // 1125-112.5
          //      1012.5
        {System.out.println("total price before tax and shipping:$"+total);
        }


    }
}
