import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        Set<String> hs = new HashSet<>();
        TreeMap<String, Integer> hm = new TreeMap<>();

        int max=0;
        while (n-- > 0) {
            String voterId = in.next();
            String partyName = in.next();
            
            if (!hs.contains(voterId)) {
                hs.add(voterId);
                if (hm.containsKey(partyName)){
                    int val = hm.get(partyName);
                    hm.put(partyName, val + 1);
                    val = hm.get(partyName);
                    if (val > max) {
                        max = val;
                    }
                }else{
                    hm.put(partyName, 1);
                   int val = hm.get(partyName);
                    if (val > max) {
                        max = val;
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> e: hm.entrySet()) {
            if(e.getValue() == max) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
