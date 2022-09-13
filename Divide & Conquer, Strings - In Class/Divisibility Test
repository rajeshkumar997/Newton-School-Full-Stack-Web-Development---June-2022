import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner in = new Scanner (System.in);
        String s = in.next();
        int sum = 0; 
        int i;
        for (i=0; i<s.length(); i++) {
            sum = sum + (s.charAt(i) - '0');
        }
        if (s.charAt(s.length() - 1) == '0') {
            if (sum % 3 == 0) {
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }
            
        }else{
            System.out.print("No");
        }
        
    }
}
