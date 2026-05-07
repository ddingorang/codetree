import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());

        int[][] field = new int[n][n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }

        }
        int temp = -1;
        for(int i=1; i<n-1; i++) {
            for(int j=1; j<n-1; j++) {
                int ttemp = 0;
                for(int k=i-1; k<=i+1; k++) {
                    for(int l=j-1; l<=j+1; l++) {
                        ttemp += field[k][l];
                    }
                }
                if(ttemp > temp) temp = ttemp;
            }
        }

        System.out.println(temp);
    }
}