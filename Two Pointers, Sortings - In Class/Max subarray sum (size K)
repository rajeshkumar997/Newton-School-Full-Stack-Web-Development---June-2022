import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long arr[] = new long[n];
        int i,j;
        long mxSum = 0;
        long sum = 0;
        
        for (i=0; i<n; i++) {
            arr[i] = in.nextLong();
        }
        if (k==1 || n == 1) {
            long max = arr[0];
            for (i=1; i<n; i++) {
                if (max<arr[i])
                    max = arr[i];
            }
            System.out.print(max);
        }else {
        for (i=0; i<k; i++) {
            sum = sum + arr[i];
        }
        mxSum = sum;
        for (i=k; i<n; i++) {
            
            mxSum = mxSum + arr[i] - arr[i-k];
            sum = Math.max(sum, mxSum);
        }
        System.out.print(sum);
        }
    }
}
