import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 371;
        int temp = n; 
        System.out.println("n is " + n);
        int m = sumofnum(n);
        if(m == temp){
            System.out.println("Armstrong no");
        } else {
            System.out.println("no armsrong no");
        }
    }
    
    static int sumofnum(int a){
        int sum = 0;
        int l = 0;
        while(a>0){
        l = a%10;    
        a = a/10;
        sum = sum + (l*l*l);
        }
        return sum;
    }
}
