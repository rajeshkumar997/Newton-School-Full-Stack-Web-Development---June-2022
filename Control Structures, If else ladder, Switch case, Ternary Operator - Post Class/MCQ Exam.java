import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc= new Scanner(System.in);
    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();
    int S = sc.nextInt();
    System.out.println(Math.max(P,Math.max(Q,Math.max(R,S))));
    }
}
