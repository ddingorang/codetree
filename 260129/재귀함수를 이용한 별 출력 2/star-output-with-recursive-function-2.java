import java.util.Scanner;
public class Main {

    public static void recur(int n) {
        if(n==0) {
            return;
        }
        for(int x = n; x>0; x--) {
            System.out.print("* ");
        }
        System.out.println();
        recur(n-1);
        for(int x = n; x>0; x--) {
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recur(n);
    }
}