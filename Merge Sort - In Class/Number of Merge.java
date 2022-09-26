import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] =new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];  
        }
        while(idx2 <= ei){
            merged[x++] = arr[idx2++]; 
        }
        for(int i=0, j=si; i<merged.length;i++, j++){
            arr[j] = merged[i];
        }
    }
    public static int divide(int arr[], int si,int ei){
        if(si < ei){
            
            int mid = si + (ei - si)/2;
            int left = divide(arr, si, mid);
            int right = divide(arr, mid+1, ei);
            conquer(arr, si, mid, ei);
            return left+right+1;
        }
        return 0;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       
        int numberofMerges = divide(arr,0,n-1);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        } 
        System.out.println("");
        System.out.println(numberofMerges);   
    }
}
