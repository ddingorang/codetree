import java.util.Scanner;
public class Main {

    static int cnt = 0;
    static void recur(int n) {
        if(n == 1){
            return;
        }
        if(n % 2 == 0) {
            cnt++;
            recur(n/2);
        }
        else if(n % 2 == 1) {
            cnt++;
            recur(n/3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur(n);
        System.out.println(cnt);
    }
}