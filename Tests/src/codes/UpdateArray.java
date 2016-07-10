package codes;

import java.net.*;
import java.awt.List;
import java.io.*;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.html.HTMLEditorKit;


public class UpdateArray {

	public static void main(String[]args)throws Exception
	{
		
		//URL test = new URL("http://www.videocardbenchmark.net/gpu_list.php");
		BufferedReader in = new BufferedReader(new InputStreamReader(test.openStream()));
		
		String input;
		while((input = in.readLine())!=null)
		{
			if(input.length()>3){
			if(input.substring(0,3).equalsIgnoreCase("<TR"))
			{
				System.out.println(input);
			}}
		}
		in.close();
		/*
		EditorKit kit = new HTMLEditorKit();
        Document doc = kit.createDefaultDocument();

        // The Document class does not yet handle charset's properly.
        doc.putProperty("IgnoreCharsetDirective", Boolean.TRUE);
        
        // Create a reader on the HTML content.
        Reader rd = getReader("http://www.videocardbenchmark.net/gpu_list.php");
        // Parse the HTML.
        kit.read(rd, doc, 0);
        //  The HTML text is now stored in the document
        
        String f = doc.getText(1705, 39144);
        
        System.out.print(f);
        
        
        try{
			FileWriter write = new FileWriter("K:\\FileToRead.txt");
			PrintWriter t = new PrintWriter(write);
			
			t.println(f);
			
			write.close();
			t.close();
		}
	
					
	catch(IOException e){}*/
	}
	
	
	static Reader getReader(String uri)
	        throws IOException
	    {
	        // Retrieve from Internet.
	        if (uri.startsWith("http:"))
	        {
	            URLConnection conn = new URL(uri).openConnection();
	            return new InputStreamReader(conn.getInputStream());
	        }
	        // Retrieve from file.
	        else
	        {
	            return new FileReader(uri);
	        }
	    }
}
