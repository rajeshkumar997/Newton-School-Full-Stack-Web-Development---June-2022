import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        while (testcase-- > 0) {
            int sizeOfArray = Integer.parseInt(br.readLine());
            int[] arr = new int[sizeOfArray];
             String [] str;
             str = br.readLine().split(" ");
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int max1, max2, max3;
            max1 = 0;
            max2 = 0;
            max3 = 0;

            for (int i = 0; i < sizeOfArray; i++) {
                if (arr[i] > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = arr[i];
                }
                else if (arr[i] > max2) {
                    max3 = max2;
                    max2 = arr[i];
                }
                else if (arr[i] > max3) {
                    max3 = arr[i];
                }
            }

            System.out.println(max1 + " " + max2 + " " + max3);
        }
    }
}
