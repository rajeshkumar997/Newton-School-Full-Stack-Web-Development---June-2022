import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner in = new Scanner (System.in);
        String s1 = in.next();
        String s2 = in.next();
        String s3 = "";
        String s4 = "";
        int sum = 0;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        int freq3[] = new int[26];

        int i;
        for (i=0; i<s1.length(); i++) {
            freq1[s1.charAt(i) - 'a'] ++;
        }
        for (i=0; i<s2.length(); i++) {
            freq2[s2.charAt(i) - 'a'] ++;
        }
        for (i=0; i<26; i++) {
            // if (freq1[i] > 1 || freq2[i] > 1) {
            freq3[i] = Math.abs(freq1[i] - freq2[i]);
            // }else{
                // freq3[i] = freq1[i] + freq2[i];
            // }
        }
        for (i=0; i<26; i++) {
            sum = sum + freq3[i];
        }
        //  for (i=0; i<26; i++) {
        //     System.out.print(freq1[i]);
        // }
        // System.out.println();
        //  for (i=0; i<26; i++) {
        //     System.out.print(freq2[i]);
        // }
        // System.out.println();
        // for (i=0; i<26; i++) {
        //     System.out.print(freq3[i]);
        // }
        int v = sum % 6;
        switch(v){
            case 0:
                System.out.print("Siblings");
                break;
            case 1:
                System.out.print("Friends");
                break;
            case 2:
                System.out.print("Love");
                break;
            case 3:
                System.out.print("Affection");
                break;
            case 4:
                System.out.print("Marriage");
                break;
            case 5:
                System.out.print("Enemy");
                break;
        }
    }
}
