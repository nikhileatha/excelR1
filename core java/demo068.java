import java.util.Scanner;

public class demo068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements in an array: ");
        int array[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
               count++;
            }
        }
        System.out.println("count of the elements: "+count);
        sc.close();
    }
    
}