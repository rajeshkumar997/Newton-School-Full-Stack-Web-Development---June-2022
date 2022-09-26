import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main{
public static long merge(int[] arr, int[] aux, int low, int mid, int high){
        int k = low, i = low, j = mid +1;
        long inversionCount = 0;
        while (i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                aux[k++] = arr[i++];
            }
            else{
                aux[k++] = arr[j++];
                inversionCount += (mid - i + 1);
            }
        }
        while (i <= mid){
            aux[k++] = arr[i++];
        }
        for (i = low; i <= high; i++){
            arr[i] = aux[i];
        }
        return inversionCount;
    }
    public static long mergeSort(int[] arr, int[] aux, int low, int high){
        if (high <= low){
            return 0;
        }
        int mid = (low + (high - low)/ 2);
        long inversionCount = 0;
        inversionCount += mergeSort(arr, aux, low, mid);
        inversionCount += mergeSort(arr, aux, mid +1, high);
        inversionCount += merge(arr, aux, low, mid, high);
        return inversionCount;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] aux = Arrays.copyOf(arr, arr.length);
        System.out.println(mergeSort(arr, aux, 0, arr.length-1));
    }
}
