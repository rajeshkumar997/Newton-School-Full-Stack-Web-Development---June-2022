import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t > 0){
            int k = scn.nextInt();
            
            evenFlag = true;
            

            String number;
            
            if(k <= 4){
                number = ""+even[k];
            }else{
                number = finder(k);
            }

            System.out.println(number);

            t--;
        }
    }

    static boolean evenFlag;
    static int[] even = {0,2,4,6,8};
    static int[] odd =  {1,3,5,7,9};

    public static String finder(int k){
        int quo = k/even.length;
        int rem = k%even.length;

        if( quo < even.length){

            String baseCaseAns = quo == 0?
                                  "" + odd[rem]:
                                  "" + even[quo] + odd[rem];
            return baseCaseAns;
        }

        String recursiveAns = finder(quo);

        recursiveAns += evenFlag ?  even[rem] : odd[rem];
        // flip the flag
        evenFlag = !evenFlag;

        return recursiveAns;
    }
}
