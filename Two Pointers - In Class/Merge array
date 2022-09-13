import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        for( i =0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
         
        int arr2[] = new int[m];
        for( i =0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        int merged[] =  new int[arr1.length+arr2.length];

        i=j=k=0;
        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                merged[k++] = arr1[i++];
            }
            else{
                merged[k++] = arr2[j++];
            }
        }
        if(i==n){
            while(j<m)
            merged[k++] = arr2[j++];
        }
        if(j==m){
            while(i<n)
            merged[k++] = arr1[i++];
        }
        for(i=0;i<k; i++){
            System.out.print(merged[i] + " ");
        }
    }
}
