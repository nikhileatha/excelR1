public class demo069 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; 
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                System.out.println( array[i]);
                sum=sum+array[i];
            }
            System.out.println("Sum of all elements:"+sum);
    }
    
}
