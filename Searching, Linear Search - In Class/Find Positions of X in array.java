import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static int linearSearch(int arr[], int x){
       for(int i=0; i<arr.length;i++){
           if(arr[i] == x){
               return i;
           }
       }
       return -1;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int x= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = linearSearch(arr,x);
        if(res ==-1){
            System.out.print("Not found");
        }
        else{
            for(int i=0; i<n; i++){
                if(arr[i] == x){
                    System.out.print(i + " ");
                }
            }
        }
         System.out.println();
        }
    }
}
