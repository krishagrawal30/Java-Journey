import java.io.*;
public class FileHandling {
    public static void main(String[] args) 
    {
        try{
            File f = new File("demo2.txt");
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
        String file = "demo.txt";
        try{
            BufferedWriter fw = new BufferedWriter(new FileWriter(file));
            fw.write("Today CSK will win the match against Kings 11 Punjab...");
            fw.close();
        }
        catch(IOException e){   
            System.out.println("IO Exception occured....");
            e.printStackTrace();
        }
        try{
            BufferedReader fr = new BufferedReader(new FileReader(file));
            String L;
            while((L= fr.readLine())!= null)
            {
               System.out.println(L);
            }
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("Can't Read this file.....");
            e.printStackTrace();
        }
    }
}