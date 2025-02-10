public class demo070 {
    public static void main(String[] args) {
        int[] array = {1,2,5,11,12,36}; 
        for (int i = 0; i < array.length; i++) {
                boolean isPrime = true;

        if (array[i] <= 1) {
            isPrime = false;
        } else {
            for ( array[i] = 2; i * i <= array[i]; i++) {  
                if (array[i] % i == 0) {
                    isPrime = false;
                 
                }
            }
        }

        if (isPrime) {
            System.out.println(array[i] + " is a prime number.");
        } else {
            System.out.println(array[i]+ " is not a prime number.");
        }
                
    }
    
    }
}
