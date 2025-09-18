// In Java, everything sits inside a class, and what we call “functions” in C are called methods in Java.

public class Main {

    // This is a **method**, not called a "function" in Java
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = sum(5, 3); // calling the method
        System.out.println("Sum = " + result);
    }
}

  
