import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DailyAdviceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		DailyAdviceClient dClient = new DailyAdviceClient();
		dClient.go();
	}
	
	public void go()
	{
		try {
			Socket charSock = new Socket("127.0.0.1",9857);
			InputStreamReader is = new InputStreamReader(charSock.getInputStream());
			
			BufferedReader br = new BufferedReader(is);
			
			String advice = br.readLine();
			System.out.println("You should " + advice + "today");
			
			br.close();
			is.close();
			charSock.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
