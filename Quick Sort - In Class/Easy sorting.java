import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str[] = new String[5];
        for(int i=0; i<5; i++){
            str[i] = sc.next();
        }
        int n = str.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(str[j].compareTo(str[j+1])>0){
                //swap
                 String temp = str[j];
                 str[j] =str[j+1];
                 str[j+1] = temp;
                }
            }   
        }
        for(int i=0; i<5; i++){
            System.out.print(str[i]+ " ");
        }
    }
}
