package in.kgcoding.challenge87;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the name of the file you wish to read: ");
        String fileName=input.next();

        try(FileReader reader=new FileReader(fileName)){
            int read;
            while((read=reader.read()) != -1){
                System.out.println((char)read);
            }

        }catch(FileNotFoundException exception){
            System.out.println("File not found");
        }
        catch(IOException exception){
            System.out.printf("Exception occured: %s",e.getMessage());
        }
    }
    
    
}
