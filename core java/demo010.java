import java.util.Scanner;
class Customer{
    String Cust_Name = "Nikhil";
    Double Balance = 10000.00;
    void accept_details(){
        System.out.println("enter ur name, account no");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        sc.nextLong();
        // Balance = sc.nextDouble();
    }
    void Display_details(){
        System.out.println("Hello "+Cust_Name);
        System.out.println("ur balance is "+ Balance);
    }
}
public class demo010 {    
    public static void main(String[] args){
        Customer obj = new Customer();
        obj.accept_details();
        obj.Display_details();
    }
}
