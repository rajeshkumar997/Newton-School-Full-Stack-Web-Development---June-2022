import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    // static int binarySearch(int x){
    //     int start = 1, end = x;
    //     int ans = 0;
    //     while(start<=end){
    //         int mid = (start+end)/2;
    //         if(mid*mid == x){
    //             return mid;
    //         }
    //         if(mid*mid<x){
    //             start = mid+1;
    //         }
    //         else{
    //             end = mid-1;
    //         }
    //     }
    //     return ans;
    // }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            System.out.println((int)Math.sqrt(n));
        }
    }
}
