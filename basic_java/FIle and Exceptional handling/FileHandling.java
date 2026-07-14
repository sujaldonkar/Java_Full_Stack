
import java.io.*;

public class FileHandling{
    public static void main(String[] args) throws IOException{
        // create file
        File newFile = new File("abc.txt");
        if(newFile.createNewFile()){
            System.out.println("Create new file");
        }else{
            System.out.println("Alerady exist");
        }

        try ( // write in file
                FileWriter fileWriter = new FileWriter("abc.txt")) {
            try {
                fileWriter.write("Hello, I Sujal \n How are you?");
            } finally{
                fileWriter.close();
            }
        }


        try ( // Read in file
                FileReader fileReader = new FileReader("abc.txt")) {
            int i;
            while((i=fileReader.read())!=-1){
                System.out.print((char)i);
            }
        }

    

    }
}