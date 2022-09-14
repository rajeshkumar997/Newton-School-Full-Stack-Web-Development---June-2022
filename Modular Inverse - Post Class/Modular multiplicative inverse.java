import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int modInverse(int a, int m){
        for (int x = 1; x < m; x++){
            if (((a%m) * (x%m)) % m == 1){
                return x;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
         int a = sc.nextInt();
          int m = sc.nextInt();
        System.out.println(modInverse(a,m));
        }
    }
}
