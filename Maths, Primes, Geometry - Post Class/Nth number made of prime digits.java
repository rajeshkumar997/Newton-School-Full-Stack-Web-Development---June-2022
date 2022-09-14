import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   static String primeDigit(int n){
     int rem;
        String num = "";
        while(n>0){
            rem = n%4;
            switch(rem){
                case 1:
                    num += '2';
                    break;
                case 2:
                    num +='3';
                    break;
                case 3:
                    num += '5';
                    break;
                case 0:
                    num += '7';
                    break;
            }
            if(n%4==0){
                n--;
            }
            n= n/4;
        }
        return new StringBuilder(num).reverse().toString();
    }
   
     public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=  sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            String res = primeDigit(n);
            System.out.println(res);
            t--;
        }
    }
}
