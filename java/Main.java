import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("C:\\Users\\Anoop Gupta\\Desktop\\Anuj\\Competitive Programming\\Puppy and Sum Problem Code PPSUM\\java\\input.txt");
		f1.createNewFile();
		System.out.println("is exist :"+f1.exists());
		System.out.println("file size:"+f1.length());
		System.out.println("File Name :"+f1.getName());
		System.out.println("can write :"+f1.canWrite());
		f1.delete();
	}
}


