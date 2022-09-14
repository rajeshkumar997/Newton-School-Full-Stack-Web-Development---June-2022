import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner m = new Scanner(System.in);
            int i;
            int n = m.nextInt();
            int [] arr = new int[n];
            for(i=0;i<n;i++) {
                arr[i]=m.nextInt();
            }
            int maxTillNow = -1;
            long sum = 0;
            for (i=0; i<n; i++) {
                maxTillNow = Math.max(maxTillNow, arr[i]); // 3
                System.out.print(maxTillNow - arr[i] + " ");
                sum += (maxTillNow - arr[i]);
                sum += arr[i];
            }
            System.out.println();
            System.out.print(sum);

    }
}
