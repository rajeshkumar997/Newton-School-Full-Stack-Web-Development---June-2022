import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static void sort(int arr[]) {
		int n = arr.length;

		for (int i=0; i<n-1; i++) { // i=3
			for (int j=0; j<n-i-1; j++) { // j=n-4
				if (arr[j] < arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] =  arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

	}

	static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        printArray(arr);
    }
}
