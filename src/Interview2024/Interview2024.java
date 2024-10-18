package Interview2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Interview2024 {

	public static void main(String[] args) {

		List<Integer> li1 = new ArrayList<>();
		Collections.sort(li1);
		int x = -2147483648;
		int out = 0;
		
			if (x > 0) {
				String l = String.valueOf(x);
				String sb = new StringBuffer(l).reverse().toString();
				try {
					out = Integer.parseInt(sb);
				}
				catch(Exception e) {
					out = 0;
				}

			} else {
				String l = String.valueOf(x);
				String sb = new StringBuffer(l.substring(1, l.length())).reverse().toString();
				int res = 0;
				boolean flag = true;
				try{
				res = Integer.parseInt(sb);
				}
				catch(Exception e) {
				  out = 0;
				  flag = false;
				}
				if(flag) {
				int sum = -(res + res);
				out = sum + res;
				}
			}
		System.out.println(out);
	}

}
