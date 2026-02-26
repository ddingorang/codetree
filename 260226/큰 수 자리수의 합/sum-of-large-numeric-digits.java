import java.util.Scanner;
public class Main {

    static String s;

    static int recur(int cnt, int summ) {
        if(cnt == s.length()) {
            return summ;
        }

        return recur(cnt+1, summ + Integer.parseInt(String.valueOf(s.charAt(cnt))));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int abc = a*b*c;

        s = String.valueOf(abc);
        System.out.println(recur(0, 0));


    }
}