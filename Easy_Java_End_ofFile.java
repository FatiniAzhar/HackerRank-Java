import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

       Scanner s = new Scanner(System.in);
       int count =1;

      //hasNext check whether he Scanner has another token in its input. A Scanner breaks its input into tokens using a delimiter pattern, which matches whitespace by default
       while(s.hasNext()){

       String numS = s.nextLine();
       System.out.println(count +" " +numS );
       count++;

       }

    }
}

