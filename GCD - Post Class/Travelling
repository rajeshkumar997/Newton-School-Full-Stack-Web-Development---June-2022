import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int gcd(int a, int b){
        if(b == 0)
        return a;
        return gcd(b, a%b);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int a[]  = new int[n];
        int arr[] = new int[n];
        for(int i=1; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<arr.length; i++){
            int o =0;
            o = arr[i] - s;
            o = Math.abs(o);
            a[i] = o;
        }
        int temp = gcd(a[0], a[1]);
        for(int i=1; i<n-1; i++){
            temp =gcd(temp,a[i+1]);
        }
        System.out.println(temp);

    }
}
