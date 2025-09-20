import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 1456854;
        System.out.println("n is " + n);
        int m = countdigit(n);
        System.out.println("no of digits are = "+ m);
    }
    
    static int countdigit(int a){
        int c = 0;
        while(a > 0){
            c = c+1;
            a = a/10;
        }
        return c;
    }
}
