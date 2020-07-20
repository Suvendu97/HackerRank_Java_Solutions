//Java BigInteger

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
     BigInteger A = new BigInteger(sc.next());
     BigInteger B = new BigInteger(sc.next());

        BigInteger  add,mult;
       add = A.add(B);
       mult = A.multiply(B);
        System.out.println( add);
        System.out.println( mult);
    }
}


