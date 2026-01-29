import java.util.Scanner;
public class Main {

    static void printStar(int n) {
        if(n==0) {
            return;
        }
        
        System.out.println("HelloWorld");
        printStar(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printStar(n);
    }
}