import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
      public static int positive(int num){
    if(num>0){
      return 1;
    }
    else if(num<0){
      return 0;
    }
    else{
      return -1;
  }
      }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = positive(num);
        switch(result){
        case 0:
        System.out.print("Negative");
        break;
        case 1:
         System.out.print("Positive");
         break;
        default:
         System.out.print("Zero");
         break;
        }
    }
}
