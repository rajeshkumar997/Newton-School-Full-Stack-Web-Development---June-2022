import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
      static int findSmallestDifference(int A[], int B[],int n){
        
        Arrays.sort(A);
        Arrays.sort(B);
     
        int a = 0, b = 0;
        int result = Integer.MAX_VALUE;
        while (a < n && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);

            if (A[a] < B[b])
                a++;
     
            else
                b++;
        }
        return result;
    }
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        int B[] = new int[n];
        for(int i=0; i<n; i++){
            B[i] = sc.nextInt();
        }
         System.out.println(findSmallestDifference(A, B, n));
    }
}
