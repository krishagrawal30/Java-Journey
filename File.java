import java.io.IOException;
import java.io.File;
public class FileHandling {
    public static void main(String[] args) {
        try{
            File f = new File("demo.txt");
            if(f.createNewFile())
            {
                System.out.println("File created Successfully with name "+f.getName());
            }
            else{
                System.out.println("File already Exist...");
            }
        }
        catch(IOException e){
            System.out.println("IO Exception occured....");
            e.printStackTrace();
        }
        
    }
}
