import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 1456854;
        System.out.println("n is " + n);
        int m = revnum(n);
        System.out.println("reverse of no is: "+ m);
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
