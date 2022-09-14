import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int window_sum =0;
        for(int i=0; i<k; i++){
            window_sum += arr[i];
        }
        for(int i=k; i<n; i++){
            int nextWindowSum = window_sum + (arr[i] -arr[i-k]);
            if(window_sum + nextWindowSum == sum){
                System.out.println("YES");
                return;
            }
            window_sum = nextWindowSum;
        }
        System.out.println("NO");
    }
}
