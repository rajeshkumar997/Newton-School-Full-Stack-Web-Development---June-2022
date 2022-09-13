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
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int start = 0, end = n-1;
        int count = 0;
        while(start<end){
            if(arr[start] + arr[end] <= x){
                start++;
                end--;
                count++;
            }else{
                end--;
            }
        }
        System.out.println(n-count);
    }
}
