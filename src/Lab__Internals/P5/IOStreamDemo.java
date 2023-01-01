package Lab__Internals.P5;

import java.io.*;
class IOStreamDemo
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String : ");
        String str = br.readLine();
        System.out.print("Enter a integer : ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Enter a double value : ");
        double num2 = Double.parseDouble(br.readLine());
        System.out.println(str+"\t"+num1+"\t"+num2);
    }
}

