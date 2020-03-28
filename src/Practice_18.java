import java.io.*;
import  java.util.Scanner;

public class Practice_18 {

    public static void main(String[] args) {

        int rows=0;
        String text;
        try(BufferedReader br= new BufferedReader(new FileReader("Practice_18.txt")))
        {
            while ((text=br.readLine())!=null)
            {
                System.out.println(text);
                rows++;
            }
        }
        catch (IOException exc)
        {
            System.out.println("Error IO:"+exc);
        }
        //System.out.println(rows);

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input "+rows+" rows");

        int i=0;
        try (FileWriter fw = new FileWriter("Practice_18.txt"))
        {
            do{
                text=br.readLine();
                if(text.compareTo("stop")==0) break;

                text=text+"\r\n";
                fw.write(text);
                i++;
            } while (i<rows);
        }catch (IOException exc)
        {
            System.out.println("Error IO:"+exc);
        }


    }
}