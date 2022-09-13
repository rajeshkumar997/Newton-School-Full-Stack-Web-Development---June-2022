import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner in = new Scanner(System.in);  
        int arrayLength = in.nextInt();
        if(arrayLength >=1 && arrayLength <=100){
            double sum = 0;
            int counter = 0;
            int myArray[] = new int[arrayLength];
            for(int i=0; i<arrayLength; i++){
                myArray[i] = in.nextInt();    
            }
                for(int i=0; i<arrayLength; i++){
                    myArray[i] = myArray[i] * myArray[i];
                    sum += myArray[i]; 
                }
                double mean = sum/arrayLength;
                double sqrt = Math.sqrt(mean);
                System.out.printf("%.6f", sqrt);
        }
    }
}
