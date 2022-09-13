import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        int min = Math.min(x,y);
        while(min>0){
            if(x%min == 0 && y%min ==0){
               ans = min;
               break; 
            }
            else{
                ans = 1;
            }
            min--;
        }
        System.out.print(ans);
    }
}
