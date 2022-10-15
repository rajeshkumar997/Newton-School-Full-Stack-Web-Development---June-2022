import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException{
                      // Your code here
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		int n = Integer.parseInt(br.readLine());	
		int xorx = 0;
		int xory = 0;
		for (int i = 0; i < 4*n + 1; i++) {
			String inputs[] = br.readLine().split(" ");
			int x = Integer.parseInt(inputs[0]);
			int y = Integer.parseInt(inputs[1]);	
			xorx = xorx^x;
			xory = xory^y;
		}	
		System.out.print(xorx + " " + xory);
    }
}
