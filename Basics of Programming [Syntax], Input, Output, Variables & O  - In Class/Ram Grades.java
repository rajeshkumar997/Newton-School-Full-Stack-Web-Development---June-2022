import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int a , b, c, d ,total,per;
      //  float total ,per ;
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
         d = sc.nextInt();
         total = (a+b+c+d);
         per = (total*100)/400;
        System.out.println(per);
    }
}
