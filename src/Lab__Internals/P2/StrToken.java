package Lab__Internals.P2;
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
