package in.kgcoding.file;
//import java.io.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args) {
        String fileName="java course.txt";
      

        try( FileWriter writer=new FileWriter(fileName)){
           ;
        writer.write("This is the best java course.\n ");
        for (int i = 0; i < 10; i++) {
            writer.write('1');
        }
        writer.flush();
        System.out.println("File written succesfully");
        }catch(IOException exception){
            System.out.printf("Exception occured %s",exception.getMessage());

        }
    }
    
}
