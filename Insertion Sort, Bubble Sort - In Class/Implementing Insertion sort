import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void InsertionSort(int arr[]) {
    
		int n=arr.length;
        for(int i=1;i<n;i++){
		    int j = i-1;
		    int temp = arr[i];
		    while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
		    arr[j+1] = temp;
		}

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
        while(t-->0){
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		InsertionSort(arr);
        }
		
    }
}
