package seleniumScripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TextFileHandling {

	public static void main(String[] args) throws Exception 
	{
		
		TextFileHandling.WriteData();
		
	}
	
	public void ReadFile() throws Exception
	{
		String Path = "C:\\Personal\\Selenium\\Projects\\Data.txt";

	     FileReader fr = new FileReader(new File(Path));
	     BufferedReader br = new BufferedReader(fr);
	     
	     

	     String content ;

	     while(( content =  br.readLine()) != null)
	     {
	         //String Lineval = br.readLine();
	         System.out.println(content);
	     }
	}
	
	public static void WriteData() throws Exception
	{
		String Path = "C:\\Personal\\Selenium\\Projects\\Data.txt";

	     FileWriter fr = new FileWriter(new File(Path));
	     BufferedWriter bw = new BufferedWriter(fr);
	     bw.write("The is written using Automation");
	     bw.newLine();
	     bw.write("The is written using Automation in new line");
	     bw.close();
	}

}
