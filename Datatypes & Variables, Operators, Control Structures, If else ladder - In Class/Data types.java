import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int i =  sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char ch = sc.next().charAt(0);
        System.out.println(i);
        System.out.println(l);
        System.out.printf("%.2f\n",f);
        System.out.printf("%.4f\n",d);
        System.out.println(ch);
    }
}
