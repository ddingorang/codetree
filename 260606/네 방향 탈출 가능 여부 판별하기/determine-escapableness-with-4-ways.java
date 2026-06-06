import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] field = new int[n][m];
        boolean[][] v = new boolean[n][m];
        int isPossible = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                field[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        v[0][0] = true;
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            if(cur[0] == n-1 && cur[1] == m-1) {
                isPossible = 1;
                break;
            }
            for(int i=0; i<4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if(0<=nx && nx < n && 0<=ny && ny<m) {
                    if(!v[nx][ny] && field[nx][ny] == 1) {
                        q.offer(new int[]{nx, ny});
                        v[nx][ny] = true;
                    }
                }
            }
        }

        System.out.println(isPossible);

    }
}