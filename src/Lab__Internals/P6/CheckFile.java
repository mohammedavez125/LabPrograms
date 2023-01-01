package Lab__Internals.P6;

/*
B) Write Java program that reads a file name from the user, and then
    displays information about whether the file exists, whether the file is
    readable, whether the file writable, the type of file and the length of the file
    in bytes.
*/

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

class Checkfile {
    public static void main(String[] args) throws IOException{
        String filename;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the file name : ");
        filename = i.nextLine();
        File obj = new File(filename);
        if (obj.exists()){
            System.out.println("File exists");
            if (obj.canRead()) System.out.println("File is Readable");
            if (obj.canWrite()) System.out.println("File is Writable");
            System.out.println("length of file is : " + obj.length());
            System.out.println("type of file is : " + Files.probeContentType(obj.toPath()));
        } else {
            System.out.println("File does not exists");
        }
    }
}