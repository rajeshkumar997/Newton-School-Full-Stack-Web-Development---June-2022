import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase>0){
            testCase--;
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            if(m==1){
                int i=0;
                while(i<n)
                System.out.print(a[0][i++] + " ");
            }
            else if(n == 1){
                int i = 0;
                while(i<m)
                System.out.print(a[i++][0] + " ");
            }
            else{
                for(int j=0; j<n; j++){
                    System.out.print(a[0][j] + " ");
                }
                for(int i=1; i<m; i++){
                     System.out.print(a[i][n-1] + " ");
                }
                for(int j=n-2; j>=0; j--){
                     System.out.print(a[m-1][j] + " ");
                }
                for(int i=m-2; i>0; i--){
                     System.out.print(a[i][0] + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
