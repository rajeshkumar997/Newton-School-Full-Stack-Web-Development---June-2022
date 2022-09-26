import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        if(arr[0] + arr[1] <= x){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void getSum(int a, int b){
        System.out.println(a+b);
    }
}
