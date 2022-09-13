import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int i;
       int maxPairSum = 0;
       for (i=0; i<n; i++) {
           arr[i] = in.nextInt();
       }
       int pairSum=0;
       Arrays.sort(arr); // 1 1 3 4
        for (i=0; i<n/2; i++) {
            pairSum = arr[i] + arr[n-1-i];
            maxPairSum = Math.max(maxPairSum, pairSum);
        }

        System.out.print(maxPairSum);

    }
}
