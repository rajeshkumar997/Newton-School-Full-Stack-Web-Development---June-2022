import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        if (x > k){
            System.out.println("NO");
            return;
        }
        long sum = 0;
        for (int i = 0; i < k; i++){
            sum += arr[i];
        }
        if (sum >= x){
            System.out.println("YES");
            return;
        }
        for (int i = k; i < n; i++){
            sum = sum + arr[i] - arr[i -k];
        }
        if (sum >= x) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
            return;
        }
    }
}
