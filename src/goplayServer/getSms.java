package goplayServer;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class getSms {
	public static void main(String[] args) {
        try {
        	String randomNumbers = RandomStringUtils.randomNumeric(5);
        	String phNo = 79393+randomNumbers;
        	System.out.println(phNo);
             String requestUrl="https://bulkpush.mytoday.com/BulkSms/SingleMsgApi?feedid=368311&username=9999464624&password=$1Billion&To=8826277650&Text="+phNo;
                URL url = new URL(requestUrl);
                HttpURLConnection uc = (HttpURLConnection)url.openConnection();

                System.out.println(uc.getResponseMessage());

                uc.disconnect();
                

        } catch(Exception ex) {
                System.out.println(ex.getMessage());

        }
}
}
