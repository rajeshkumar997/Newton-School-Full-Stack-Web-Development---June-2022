import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    public static void main (String[] args) {
                      // Your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int i;
        for (i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        int max = 0;
        for (i=0; i<n; i++) {
            max = Math.max(max, arr[i]);
        }
      
        int count = 0;
        // int gcd = 0;
        while(max>0){
        for (i=0; i<n; i++) {
            if(arr[i]%max==0)
            count++;
        }
        if(count >= 2){
            System.out.print(max);
            break;
        }
        max--;
        count = 0;
        }       
    }
}
