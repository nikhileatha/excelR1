public class demo060{
    public static void main(String[] args) {
        int n = 20;
        long first = 0, second = 1;
        
        System.out.println("First " + n + " Fibonacci numbers:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
    }
}
