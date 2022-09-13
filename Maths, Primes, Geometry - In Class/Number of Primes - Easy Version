import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while(t>0){
                int count=0;
                int prime=0;
                int n = in.nextInt();
                for(int i=2; i<=n; i++){
                    for(int j=1; j<=i; j++){
                        if(i%j==0){
                            count++;
                        }
                    }
                    if(count==2){
                        prime ++;
                    }
                    count = 0;
                }
                System.out.println(prime);
                t--;
            }
        
    }
}
