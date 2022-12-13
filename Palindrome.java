package LECTURE2;

public class Palindrome{

    // TC : theta(log(n))
    public static boolean checkPalindrome(int n){
        int temp = 0;
        for(int i = n; i > 0; i/=10){
            temp = (temp*10) + (i%10);
        }
        
        /*
        if(temp==n)
            return true;
        else 
            return false;
        */

        return (n==temp);
    }

    public static void main(String[] args){
        int n = 2112;
        System.out.println(checkPalindrome(n));
        System.out.println("I'm in the main method of Palindrome class");
        
    }
}