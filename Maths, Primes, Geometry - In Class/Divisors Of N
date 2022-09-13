import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count =0 , i;
        while(t-->0){
            int n = sc.nextInt();
            for(i=1; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    if(i%2 == 0){
                        count++;
                    }
                    if((n/i)%2==0){
                        count++;
                    }
                }
            }
            i--;
            if((i*i==n) && (i%2==0)){
                count--;
            }
            System.out.println(count);
            count = 0;
        }
    }
}
