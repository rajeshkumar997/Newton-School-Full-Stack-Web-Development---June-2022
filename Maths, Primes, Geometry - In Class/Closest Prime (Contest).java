import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
      
    public static int Pr(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return -1;
            }
        }
        return 1;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, diff1=0,diff2=0,num1=0,num2=0;
        if(n==1){
            System.out.print(2);
        }
        else{
            for(i=n;;i++){
                if(Pr(i)==1){
                    diff1 = i-n;
                    num1 = i;
                    break;
                }
            }
            for(i=n;;i--){
                if(Pr(i)==1){
                    diff2 =n-i;
                    num2=i;
                    break;
                }
            }
            if(diff1>=diff2){
                System.out.print(num2);
            }
            else{
                System.out.print(num1);
            }
        }               
    }
}
