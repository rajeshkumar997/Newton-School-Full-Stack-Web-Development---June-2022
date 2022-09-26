import java.io.*; // for handling input/output
import java.util.*; 

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0, j=2;
        long result = 0;
                      
         while(j<n){
            if(i == j-1){
                j++;
                continue;
            }
            if(arr[j]-arr[i]>p){
                i++;
            }
            else{
                int x = j-i;
                result += (x*(x-1))/2;
                j++;
            }
        }
        System.out.println(result);
    }
}
