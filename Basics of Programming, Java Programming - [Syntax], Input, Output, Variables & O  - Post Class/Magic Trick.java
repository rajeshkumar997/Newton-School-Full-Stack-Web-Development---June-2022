import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int X = 2;
int res = (((((X+A)*2)+B)/2)-X);
System.out.println(res);
    }
}
