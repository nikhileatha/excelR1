public class demo014 {
    public static void main(String[] args) {
        int a = 10;
        int b = -a; 
        int c = +a; 
        
        int x = 5;
        int preIncrement = ++x; 
        int postIncrement = x++; 

        int y = 5;
        int preDecrement = --y; 
        int postDecrement = y--; 
        boolean flag = true;
        boolean notFlag = !flag;

        System.out.println("Unary minus of a: " + b);
        System.out.println("Unary plus of a: " + c);
        System.out.println("Pre-increment of x: " + preIncrement);
        System.out.println("Post-increment of x: " + postIncrement);
        System.out.println("Pre-decrement of y: " + preDecrement);
        System.out.println("Post-decrement of y: " + postDecrement);
        System.out.println("Logical NOT of flag: " + notFlag);
    }
}
