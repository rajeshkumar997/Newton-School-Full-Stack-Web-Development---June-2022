import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
		 Scanner in = new Scanner(System.in);
        float a,b,c;
        double root1, root2, real, imag, d, sqrt;
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        d = (b * b) - (4 * a * c);
        int n=0;
        if(d>0){
            n=1;
        }else if(d<0){
            n = -1;
        }else if(n==0){
            n = 0;
        }

        switch(n){
            case 1:
                sqrt = Math.sqrt(d);
                root1 = (-b + sqrt)/(2*a);
                root2 = (-b - sqrt)/(2*a);
                System.out.printf("%.2f\n",root1);
                System.out.printf("%.2f\n",root2);
                break;
            case -1:
                sqrt = Math.sqrt(-1 * d);
                real = -b/(2*a);
                imag = sqrt/(2*a);
                System.out.printf("%.2f+i%.2f\n",real,imag);
                System.out.printf("%.2f-i%.2f\n",real,imag);
                break;
            case 0:
                root1 = -b/(2*a);
                root2 = -b/(2*a);
                System.out.printf("%.2f\n",root1);
                System.out.printf("%.2f\n",root2);
        }

    }
}
