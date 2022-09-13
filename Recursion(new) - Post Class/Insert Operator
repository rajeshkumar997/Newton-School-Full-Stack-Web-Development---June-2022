import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long arr[] = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        boolean answer = operator(arr,k,1,arr[0]);

        if(answer){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static boolean operator(long[] arr, long k, int idx, long ans){
            // base case
        if(idx == arr.length){
                if(k == ans){
                    return true;
                }
                else{
                    return false;
                }
        }
            // faith
        boolean possibility1 = operator(arr,k,idx+1, ans-arr[idx]);
        boolean possibility2 = operator(arr,k,idx+1, ans+arr[idx]);

        // if(possibility1 == true || possibility2 == true){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return possibility1 || possibility2;
    }
  
}
