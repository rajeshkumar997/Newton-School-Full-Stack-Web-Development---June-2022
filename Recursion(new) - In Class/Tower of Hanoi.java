import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void towerOfHanoi(int N, String A, String B, String C){
        if(N == 1){
            System.out.println(+N+ ":"+ A +"->" + C);
            return;
        }
        towerOfHanoi(N-1, A, C, B);
        System.out.println( +N+ ":" + A +"->" + C);
        towerOfHanoi(N-1, B, A, C);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        towerOfHanoi(N, "A", "B", "C");
    }
}
