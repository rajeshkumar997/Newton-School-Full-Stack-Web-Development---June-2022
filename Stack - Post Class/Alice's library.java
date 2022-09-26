import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
 public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ipStr = br.readLine();
 
		Stack<String> stack = new Stack<String>();
		StringBuffer sb = new StringBuffer();
 
		for (int i = 0; i < ipStr.length(); ++i) {
			if (ipStr.charAt(i) == '/') {
				if (sb.length() > 0) {
					stack.push(sb.toString());
					sb = new StringBuffer();
				}
				stack.push("/");
			} else if (ipStr.charAt(i) == '\\'){
				stack.push(sb.toString());
				sb = new StringBuffer();
				String s = stack.pop();
				StringBuffer sbNew = new StringBuffer();
				while (!s.equalsIgnoreCase("/")) {
					sbNew.insert(0, s);
					s = stack.pop();
				}
				stack.push(sbNew.reverse().toString());
			} 
            else {
				sb.append(ipStr.charAt(i));
			}
		}
		System.out.println(stack.pop());
    }
}
