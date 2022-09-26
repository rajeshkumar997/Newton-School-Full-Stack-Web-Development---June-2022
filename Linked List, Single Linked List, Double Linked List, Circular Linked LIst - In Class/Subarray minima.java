import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static class pair
{
    int first, second;
    public pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

static long sumSubarrayMins(int A[], int n){
    long []left = new long[n];
    long []right = new long[n];
 
    Stack<pair> s1 = new Stack<pair>();
    Stack<pair> s2 = new Stack<pair>();

    for (int i = 0; i < n; ++i){
        int cnt = 1;
        while (!s1.isEmpty() && (s1.peek().first) > A[i]){
            cnt += s1.peek().second;
            s1.pop();
        }
        s1.push(new pair(A[i], cnt));
        left[i] = cnt;
    }
 
    for (int i = n - 1; i >= 0; --i){
        int cnt = 1;
        while (!s2.isEmpty() && (s2.peek().first) >= A[i]){
            cnt += s2.peek().second;
            s2.pop();
        }
        s2.push(new pair(A[i], cnt));
        right[i] = cnt;
    }
    long result = 0;
    for (int i = 0; i < n; ++i){
        result = (result + A[i]*left[i]*right[i]);
    }
    return result;
}
    public static void main (String[] args) {
                      // Your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<n;i++)
        arr[i] = s.nextInt();

        System.out.println(sumSubarrayMins(arr, n));              
    }

}
