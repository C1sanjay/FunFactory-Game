import java.util.Scanner;

public class FunFactory {
    public static void main(String[] args) {
        Scanner ms=new Scanner(System.in);
        System.out.println("Enter Amount for buying  Game Zone card");
        int a=ms.nextInt();//enter amount  and select day
        String n=ms.nextLine();
        GameZone cs=new GameZone(a,n);
        System.out.println("Your enter amount is:"+cs.amount);
        cs.entryPoint();


    }
}
class GameZone {
    int amount;
    int i;
    //create a constructor
    GameZone(int amount, String dayName) {
        System.out.println("Welcome To GameZone FunFactory");
        this.amount = amount;
        thsi.n=dayName;
        if ((dayName == "sunday" || dayName == "saturday") &&(this.amount>10)){
            this.i = 2;//sunday and saturday i=2;
        } else {
            this.i = 1;
        }



    }

   public void entryPoint() {
        System.out.println("Please select Y/N");
        Scanner ep = new Scanner(System.in);
        char c = ep.next().charAt(0);
        if (c == 'Y') {
            System.out.println("Select Option.For entery point-- Gate1-- or --Gate10--");
            System.out.println("Only Two Enter Poin G1 or G10");
            selectGate();
        } else if (c == 'N') {
            System.out.println("Yor are not want to Enjoy with FunFactory");
        }

    }

    void selectGate() {
        char v;
        Scanner pp = new Scanner(System.in);
        System.out.println("Select Gate Number");
        int select = pp.nextInt();
        if ((select == 1)&&(amount>10) )
        {
            for (int gNumber = 1; gNumber <= 10 && amount>=10; gNumber++)
            {
                amount = amount - 10 * i;
                System.out.println("Available blance is:"+amount);
                System.out.println("------------------------------");
                System.out.println("You want to enter next Game Zone");
                System.out.println("Enter.. Y/N");
                v = pp.next().charAt(0);
                if ((v == 'Y')&&(amount>10)) {
                    System.out.println("Next Game Zone is:" + (gNumber+1));
                    int balance = amount - 10 * i;
                    System.out.println(" Avlbalnce balance is:"+balance);
                } else {
                    return;
                }

            }
        } else if ((select == 10) && (amount>=10))
        {
            char vi;
            for (int gNumber = 10; gNumber >= 1 && this.amount>10; gNumber--) {
                amount = amount - 10 * i;
                System.out.println("Available blance is:" + amount);
                System.out.println("Next Game Zone is:" + (gNumber - 1));
                System.out.println("You want to enter next Game Zone");
                System.out.println("------------------------------");
                System.out.println("Enter Y/N");
                vi = pp.next().charAt(0);
                if ((vi == 'Y')&&(amount>10))
                {
                    System.out.println("Next Game Zone is:" + (gNumber-1));

                    int balance=amount-10*i;
                    System.out.println("Available balance is:"+balance);
                } else {
                    return;
                }
            }


        }else{
            System.out.println("Your amount is low");
            return;
        }


    }
}






