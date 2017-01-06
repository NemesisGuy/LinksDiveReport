import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;



public class LinksDiveReport{

	public static void main(String [] args)throws Exception{
		//call getTodaysDate()
		//call getDataSet()
		//call dataParse()
	}
	public static void getTodaysDate(){
		//get date
		//call date format
	}
	public static void formatDate(){
		//format date
	}
	public static void getDataSet(){
		// Make a URL to the web page
		try{
			URL url = new URL("https://api.worldweatheronline.com/premium/v1/marine.ashx?q=33.9249,18.4241&key=f036ca13415941e8ad572724170601&");
		        // Get the input stream through URL Connection
		        URLConnection con = url.openConnection();
		        InputStream is =con.getInputStream();
				// Once you have the Input Stream, it's just plain old Java IO stuff.

				// For this case, since you are interested in getting plain-text web page
				// I'll use a reader and output the text content to System.out.

				BufferedReader br = new BufferedReader(new InputStreamReader(is));

				String line = null;

				// Read each line and write to System.out
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}catch(Exception e){
			 	System.out.println(e.getMessage());
			 	System.exit(1);
			}

	}
	public static void dataParse(){
				//parse data here
		}

}