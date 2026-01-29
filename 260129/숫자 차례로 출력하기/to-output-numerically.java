import java.util.Scanner;
public class Main {

    static void recur1(int n) {
        if(n==0) {
            return;
        }
        recur1(n-1);
        System.out.print(n + " ");
    }

    static void recur2(int n) {
        if(n==0) {
            return;
        }
        System.out.print(n + " ");
        recur2(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // Please write your code here.

        recur1(x);
        System.out.println();
        recur2(x);
    }
}