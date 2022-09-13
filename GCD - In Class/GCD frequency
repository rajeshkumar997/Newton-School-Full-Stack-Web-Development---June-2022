import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int getGCD(int a, int b){
        int min = Math.min(a,b);
        while(min>0){
            if(a%min ==0 && b%min == 0){
                break;
            }
            min--;
        }
        return min;
    }
    public static void main (String[] args) {
                      // Your code here
         Scanner sc = new Scanner(System.in);
         int sum=0;
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            int input = sc.nextInt();
            arr[i] = input;
        }
        int frequency[] = new int[100001];
        for(int i=0; i<size; i++){
            frequency[arr[i]]++;
        }
        for(int i=0; i<size; i++){
           // if(frequency[arr[i]]>0){
               sum += getGCD(arr[i],frequency[arr[i]]);
           // System.out.println(arr[i] + ":" + frequency[arr[i]]);
            }
          // frequency[arr[i]] = 0;
          System.out.print(sum); 
         
    }
}
