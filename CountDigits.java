package LECTURE2;

public class CountDigits{

    // Time Efficient solution using log calculation.
    // TC : thetha(1)
    public static int countDigits(int n){
        return ((int)Math.log10(n) + 1);
    }

    // Naive solution by using modulas and divident
    // TC : thetha(log(n))
    public static int countDigits1(int n){
        int count = 0;
        for(int i = n; i > 0; i/=10 ){
            count++;
        }
        return count;
    }
    
    public static void main(String[] args){
        int n = 34452;
        System.out.println(countDigits(n));
        System.out.println(countDigits1(n));
    }
}
