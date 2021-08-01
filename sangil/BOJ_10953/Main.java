package sangil.BOJ_10953;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			String line = br.readLine();
			StringTokenizer sc = new StringTokenizer(line, ",");
			int a = Integer.parseInt(sc.nextToken());
			int b = Integer.parseInt(sc.nextToken());
			
			bw.write(a+b + "\n");
			bw.flush();
						
		}
		bw.close();
	}
}