import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int r = sc.nextInt();

        double theta = Math.asin(r/(double)(R-r));
        double possible = Math.PI/theta;
        if(N>possible || r>R){
            System.out.println("No");
        }
        else{
             System.out.println("Yes");
        }
    }
}
