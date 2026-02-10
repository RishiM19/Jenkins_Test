import java.io.*;
public class add {
    public static void main(String args[]) throws IOException
    {
BufferedReader br = new BufferedReader(new FileReader("input.txt"));
int a = Integer.parseInt(br.readLine());
int b = Integer.parseInt(br.readLine());
System.out.println("Addition =" + (a+b));
    }
    
}
