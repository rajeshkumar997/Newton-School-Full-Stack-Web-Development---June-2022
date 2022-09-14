import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner in = new Scanner (System.in);
        String a = in.next();
        String b = in.next();

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        A = A.add(B);
        System.out.print(A);
    }
}
