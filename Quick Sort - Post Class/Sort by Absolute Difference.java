import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

        // don't change the name of this class
        // you can add inner classes if needed
class Main {
public static void main (String[] args) {
               // Your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,0,n-1,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }
}

    public static void merge(int arr[], int l , int mid,int h,int x){
        int n1=mid-l+1;
        int n2 = h-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i =0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i =0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=l;

         while(i<n1 && j<n2){
            if(Math.abs(left[i] - x)<=Math.abs(right[j] - x)){
                 arr[k++] = left[i++];
            } 
            else{
                arr[k++] = right[j++];
            }
     
        }
            while(i<n1){
                    arr[k++] = left[i++];
            }
            while(j<n2){
                arr[k++] = right[j++];
            }

        }
        public static void sort(int arr[], int l,int h,int k){
            if(l<h){
            int mid = l+(h-l)/2;
            sort(arr,l,mid,k);
            sort(arr,mid+1,h,k);
            merge(arr,l,mid,h,k);
        }
    }
}
