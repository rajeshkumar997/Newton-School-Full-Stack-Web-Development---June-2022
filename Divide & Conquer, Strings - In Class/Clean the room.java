import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String[] arr = new String[n];
       for(int i=0; i<n; i++){
           arr[i] = sc.next();
       } 
       int ans =0;  
       for(int i=0; i<n; i++){
           int counter =0;
           for(int j=0; j<n; j++){
           if(arr[i].equals(arr[j]))
           counter++;
           }
           ans = Math.max(ans,counter);
       } 
       System.out.print(ans);           
    }
}
