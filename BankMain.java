package bankapplication;
import java.util.Scanner;
public class BankMain {
public static void main(String[] args) {
        
        int a=1;
        System.out.println("                        Welcome To III BA1                        ");
        do{
        BA1 b=new BA1();
        if(a==BA1.n){
        System.out.println("|-------------------|");
        System.out.println("| 1.Deposite Money  |");
        System.out.println("| 2.Withdraw Money  |");
        System.out.println("| 3.Balance Check   |");
        System.out.println("| 4.Reset Password  |");
        System.out.println("| 5.Exit From Menu  |");
        System.out.println("|-------------------|");
		System.out.print("Enter Your Choice:- ");
        }
        Scanner s=new Scanner(System.in);
        int ch=s.nextInt();
        switch(ch){
            case 1:{
                b.Deposite();
               // b.con();
              //  int c=a;
            }break;
            case 2:{
                b.Widhdraw();
              //  b.con();
              //  int c=a;
            }break;
            case 3:{
                b.BalanceCheck();
              //  b.con();
             //   int c=a;
            }break;
            case 4:{
                b.password();
             //   b.con();
               // int c=a;
            }break;
            case 5:{
                BA1.quit=false;
                System.out.println("Thank You for using bank servicess....");
            }break;
            default:{
                System.out.println("Invalid choices......");
                System.out.println("_____________________________________________________________________________________________________");
            }
        }
        
    }while(BA1.quit);
}
    

}
