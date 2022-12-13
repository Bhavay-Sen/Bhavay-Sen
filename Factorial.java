package LECTURE2;

public class Factorial{
    // Recurrsive
    public static int factorial(int n){
        if(n<= 0) 
            return 1;
        return n * factorial(n-1); 
    }

    //iterative 
    public static int facto(int n){
        int temp = 1;
        for(int i = n ; i > 0 ; i--){
            temp = temp * i;
        } 
        return temp;
    }
    
    public static void main(String[] args){
        Palindrome.main(null);
        int n = 5; // 5.4.3.2.1
        System.out.println(facto(n));
    }
}