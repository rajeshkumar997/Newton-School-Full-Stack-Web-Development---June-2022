import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void sortInWave(int arr[], int n)
    {
        Arrays.sort(arr);
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Main ob = new Main();
        ob.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i+" ");
    }
}
