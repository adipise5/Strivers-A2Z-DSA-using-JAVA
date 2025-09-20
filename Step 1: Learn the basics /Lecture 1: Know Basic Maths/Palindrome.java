import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 658;
        int temp = n; 
        System.out.println("n is " + n);
        int m = revnum(n);
        if(m == temp){
            System.out.println("is a palindrome");
        } else
        System.out.println("not a palindrome");
    }
    
    static int revnum(int a){
        int r = 0;
        while (a != 0){
            int lastdigit = a%10;
            r = r * 10 + lastdigit;
            a = a/10;
        }
        return r;
    }
}
