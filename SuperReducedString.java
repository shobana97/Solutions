import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* input: aaabccddd
	output: abd*/

public class SuperReducedString {

    static String super_reduced_string(String s){
        StringBuilder sb = new StringBuilder(s);
        int len = sb.length();
        for(int i = 0; i < len-1 ;i++ ){
            if(sb.charAt(i) == sb.charAt(i+1)){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = -1; //Reset i to 0 so that it can check from the beginning
                len = sb.length();
            }
        }
        s = sb.toString();
        if(s.length() == 0)
            return "Empty String";
        else 
            return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}