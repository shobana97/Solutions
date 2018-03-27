import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {

    static int solve(int n, int p){
        int pairs;
        if(n % 2 == 0){
            pairs = n / 2 + 1;
        }
        else pairs = (n-1)/2 + 1;
        if(n - p > p - 1){
            return p/2;
        }
        else return (pairs - (p/2+1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
