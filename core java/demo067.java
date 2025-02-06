import java.util.Scanner;

public class demo067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements in an array: ");
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println("Even Elements in an array: "+array[i]);
            }
        }
        sc.close();
    }
    
}