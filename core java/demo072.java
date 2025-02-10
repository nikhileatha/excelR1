class LinearSearch {

    public static int search(int arr[], int N, int x) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

public class demo072 {
    public static void main(String[] args) {
        int arr[] = {11, 54, 22, 77, 5};
        int x = 54;
        int N = arr.length;
        int result = LinearSearch.search(arr, N, x);
        if (result == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element:"+x+":found at index:" + result);
        }
    }
}

     
    
    
