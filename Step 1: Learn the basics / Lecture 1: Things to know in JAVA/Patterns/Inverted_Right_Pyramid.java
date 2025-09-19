/*
* * * * * 
* * * * 
* * * 
* * 
* 
*/

class Main {
    public static void main(String[] args) {
        int n = 5;
        int i=1;
        int j;
        for(i=1; i<=n; i++){
            for(j=n; j>=i; j--){
                System.out.print("* ");
            }
             System.out.println();
        }
    }
}
