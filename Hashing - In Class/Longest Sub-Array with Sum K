import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
// class Main {
//     static int lenOfLongSubarr(int arr[],int n,int k){
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int sum =0, max_len = 0;
//         for(int i=0; i<n;i++){
//             sum = sum+arr[i];
//             if(sum == k){
//                 max_len = i+1;
//             }
//             if(!map.containsKey(sum)){
//                 map.put(sum,i);
//             }
//             if(map.containsKey(sum-k)){
//                 if(max_len<(i - map.get(sum - k))){
//                     max_len = i - map.get(sum - k);
//                 }
//             }
//         }
//         return max_len;
//     }
//     public static void main (String[] args) {
//                       // Your code here
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             int k = sc.nextInt();
//             int arr[] = new int[n];
//             for(int i=0; i<n; i++){
//                 arr[i] = sc.nextInt();
//             }
//             System.out.println(lenOfLongSubarr(arr,n,k));
//         }
        
//     }
// }

class Main {
    public static void main(String[] args) throws IOException{
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
        while (t-->0) {
            String srr[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(srr[0]);
            int k = Integer.parseInt(srr[1]);
             String ksrr[] = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] =Integer.parseInt(ksrr[i]);
            }
            System.out.println(lenOfLongSubarr(arr, n, k));
        }
    }

    private static int lenOfLongSubarr(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                if (maxLen < (i - map.get(sum - k))) {
                    maxLen = i - map.get(sum - k);
                }
            }
        }
        return maxLen;
    }
}
