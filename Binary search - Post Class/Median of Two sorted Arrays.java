import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static double findMedian(int []ar1, int n,int []ar2, int m){
	    int i = 0;
	    int j = 0; 
	    int  count;
	    double m1 = -1, m2 = -1;

	    for (count = 0; count <= (m + n)/2; count++){
		    m2=m1;
		    if(i != n && j != m){
			    m1 = (ar1[i] > ar2[j]) ? ar2[j++] : ar1[i++];
		    }
		    else if(i < n){
			    m1 = ar1[i++];
		    }
		    else{
			    m1 = ar2[j++];
		    }
	    }
	    if((m + n) % 2 == 1){
		    return m1;
	    }
	    else{
		    return (m1+m2)/2;
	    }
    }	
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ar1[] = new int[n];
        int ar2[] = new int[m];
        for(int i=0; i<n; i++){
            ar1[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            ar2[i] = sc.nextInt();
        }
        System.out.printf("%.2f",findMedian(ar1,n,ar2,m));
        
    }
}
