package bankapplication;
import java.util.Scanner;
public class BA1 {
	private static double bal;
    private static int pwd;
    private static int pwd1=123;
    static double money;
    static double dep;
    static int n=1;
	static boolean quit=true;
	static{
		System.out.println("***********************************************************************************************************************");
		System.out.println();
		System.out.println("Your Current Password is :- \"123\" ");

	}
    public static void Deposite(){
        System.out.print("Enter Your Password- ");
        Scanner p=new Scanner(System.in);
        pwd=p.nextInt();
        if(pwd==pwd1){
            System.out.print("Enter Amount To be deposite :- ");
            Scanner s=new Scanner(System.in);
            money=s.nextDouble();
            bal=bal+money;
            dep=bal;
            System.out.println("Deposited Amount:- "+money);
            BA1.con11();
            if(n==1){
                System.out.println("Total Balance:- "+bal);
                System.out.println("_______________________________________________________________________________________________________________");    

            }                BA1.con1();
                 }
        else{
            System.out.println("Incorrect Password......");
            System.out.println("_______________________________________________________________________________________________________________");
			BA1.con1();
		}
    }
    public static void Widhdraw(){
        System.out.print("Enter Your Password:- ");
        Scanner p=new Scanner(System.in);
        pwd=p.nextInt();
        if(pwd==pwd1){
            System.out.print("Enter Amount To be Withdraw :- ");
            Scanner s=new Scanner(System.in);
            bal=dep;
            money=s.nextDouble();
            if(bal>=money){
            bal=bal-money;
            System.out.println("Withdraw Amount:- "+money);
                        BA1.con11();
            if(n==1){
                System.out.println("Available Balance:- "+bal);
                System.out.println("_______________________________________________________________________________________________________________");    
				
			}BA1.con1();
            
        }
        else{
            System.out.println("Insufficient Money..Enter valid amount.... ");
            System.out.println("_______________________________________________________________________________________________________________");
			BA1.con1();
		}
        }
        else{
            System.out.println("Incorrect Password......");
            System.out.println("_______________________________________________________________________________________________________________");
			BA1.con1();
		}
    }
    public static void password(){
        System.out.print("Enter Your Old Password:- ");
        Scanner p1=new Scanner(System.in);
        pwd=p1.nextInt();
        if(pwd==pwd1){
        System.out.print("Enter Your New Password:- ");
        Scanner pw=new Scanner(System.in);
        pwd1=pw.nextInt();
		BA1.con1();
        }
        else{
            System.out.println("Incorrect Password......");
            System.out.println("_______________________________________________________________________________________________________________");
			BA1.con1();
		}

    }
    public static void BalanceCheck(){
        System.out.print("Enter Your Password:- ");
        Scanner p=new Scanner(System.in);
        pwd=p.nextInt();
        dep=bal;
        if(pwd==pwd1){
            System.out.println("Available Balance:- "+dep);
            System.out.println("_______________________________________________________________________________________________________________");
			BA1.con1();
		}
        else{
            System.out.println("Incorrect Password......");
            System.out.println("_______________________________________________________________________________________________________________");
			BA1.con1();
		}
    }
	public static int con11(){
        
		boolean q=true;
        do
        {
		System.out.println("Would you like to display your balance?");
            System.out.println("1.Yes");
            System.out.println("2.No");
			Scanner w=new Scanner(System.in);
        n=w.nextInt();
		if (n==1)
		{
			quit=true;
			q=false;
		}
		else if(n==2)
		{
			quit=false;
			q=false;

		}
		else{
			System.out.println("Enter valid choice....");
			q=true;
		}
        }
        while (q);
		return n;
    }
    public static void con1(){
        
		boolean q=true;
        do
        {
			System.out.println("Would you like to countinue:- ");
        System.out.println("1.Yes");
        System.out.println("2.No");
			Scanner w=new Scanner(System.in);
        n=w.nextInt();
		if (n==1)
		{
			quit=true;
			q=false;
		}
		else if(n==2)
		{
			quit=false;
			q=false;

		}
		else{
			System.out.println("Enter valid choice....");
			q=true;
		}
        }
        while (q);
    }
}
