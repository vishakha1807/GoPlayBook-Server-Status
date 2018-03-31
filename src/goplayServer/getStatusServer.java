package goplayServer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;


public class getStatusServer {
	
	static WebDriver driver;
	public static void main(String args[]) throws Exception {
		
		String[] hostList = { "http://172.104.50.75/admin/","http://52.66.194.65/admin/" };
 
        for (int i = 0; i < hostList.length; i++) {
            String url = hostList[i];
            String status = getStatus(url);
            System.out.println(url + "\t\tStatus:" + status);
        }
       
}
	public static String getStatus(String url) throws IOException {
        	String result = "";
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
 
            int code = connection.getResponseCode();
            System.out.println(code);
            if (code == 200) 
            {
            	if(url.equals("http://172.104.50.75/admin/"))
            		result = "Testing Server is Working";
            	else
            		result = "production server is working";
            }
            else 
            {
            	 
        		String randomNumbers = RandomStringUtils.randomNumeric(2);
        		if(url.equals("http://172.104.50.75/admin/"))
        			result="There%20is%20some%20problem%20in%20Testing%20Server%20of%20GoPlayBook%20"+randomNumbers;
        		else
        			result="There%20is%20some%20problem%20in%20Production%20Server%20of%20GoPlayBook%20"+randomNumbers;
        		String[] phoneList = { "7500355112","9560425429","8920837692" };
        		for(int i = 0; i < phoneList.length; i++) {
        		String mob = phoneList[i];
                String requestUrl="https://bulkpush.mytoday.com/BulkSms/SingleMsgApi?feedid=368311&username=9999464624&password=$1Billion&To="+mob+"&Text="+result;
                URL url1 = new URL(requestUrl);
                HttpURLConnection uc = (HttpURLConnection)url1.openConnection();
                System.out.println(uc.getResponseMessage());
                uc.disconnect();
        	 }
            result = "Server Is Not Working";
        }
        return result;
    }
 
}