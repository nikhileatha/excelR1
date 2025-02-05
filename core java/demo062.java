public class demo062{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; 

        if (numbers.length >= 2) {
            System.out.println("1st element: " + numbers[0]);
            System.out.println("2nd element: " + numbers[1]);
            System.out.println("Last element: " + numbers[numbers.length - 1]);
        } else {
            System.out.println("Array must have at least two elements.");
        }
    }
}
