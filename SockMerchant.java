import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int pair = 0;
        int flag[] = new int[n];
        for(int i =0 ; i < n ; i++){
            if(flag[i] == 0){
               for(int j = i+1; j < n; j++){
                    if(ar[i] == ar[j] && flag[j] != 1){
                        pair++;
                        flag[i] = 1;
                        flag[j] = 1;
                        break;
                    }
                }
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
