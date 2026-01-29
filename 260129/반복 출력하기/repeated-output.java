import java.util.Scanner;

public class Main {

    static void printLine() {
        System.out.println("12345^&*()_");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        for(int i=0; i<n; i++) {
            printLine();
        }
    }
}