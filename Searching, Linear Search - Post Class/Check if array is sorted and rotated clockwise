import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean sortRotated(int arr[], int n){
        int x=0, y=0;
        for(int i=0; i<n-1;i++){
            if(arr[i]<arr[i+1]){
                x++;
            }
            else{
                y++;
            }
        }
        if(x==1 || y==1){
            if(arr[n-1]<arr[0]){
                x++;
            }
            else{
                y++;
            }
        }
        if(x==1 || y==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
        while( t-->0){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i= 0;i<n; i++){
            arr[i] = sc.nextInt();
       
        }
       // Arrays.sort(arr);
        boolean x= sortRotated(arr,n);
        if(x == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
    }
}
