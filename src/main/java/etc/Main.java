package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			char[] c = str.toCharArray();
			
			boolean flag = false;
			
			loof:
			for(int j = 0; j < str.length() - 1; j++) {
				for(int k = j + 1; k < str.length(); k++) {
					if(c[j] != c[k]) {
						flag = true;
					}
					if(flag && c[j] == c[k]) {
						cnt++; break loof;
					}
				}
			}
			
		}
		
		System.out.println(cnt);
		
	}

}
