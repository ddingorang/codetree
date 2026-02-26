import java.util.Scanner;
public class Main {

    static int[] a;
    static int recur(int idx, int max) {
        if(idx == a.length) return max;
        
        if(a[idx] > max) {
            max = a[idx];
        }
        
        return recur(idx+1, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int result = recur(0, 0);
        System.out.println(result);
    }
}