package Lab__Internals.P2;

/*
A) Write a Java Program that reads a line of integers, and then displays each
  integer, and the sum of all the integer (Use String Tokenizer class of java.util)
*/

import java.util.*;
public class StrToken {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1=in.nextLine();
        int sum=0;
        StringTokenizer st= new StringTokenizer(s1," ");
        while(st.hasMoreTokens()){
            int val=Integer.parseInt(st.nextToken());
            sum=sum+val;
            System.out.println(val);
        }
        System.out.println("Sum : "+sum);
    }
}
