import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
                      // Your code here
        // Scanner sc = new Scanner(System.in);
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        // int [][]arr = new int[m][n];
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q= Integer.parseInt(br.readLine());
        while(q-->0){
            String []str;
            str = br.readLine().split(" ");
            int m = Integer.parseInt(str[0]);
            int n = Integer.parseInt(str[1]);
            int [][]arr = new int [m][n];
            for(int i=0; i<m;i++){
                str = br.readLine().split(" ");
                for(int j=0;j<n; j++)
                    arr[i][j] = Integer.parseInt(str[j]);
                
            }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] ==1){
                    for(j=0; j<n; j++)
                        arr[i][j] = 1;
                        break;
                    
                }
            }
        }   
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            }
                System.out.println();
        }
        
        }  
    }
}
