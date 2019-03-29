import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import data.*;
import utility.ArraySet;
import mining.*;

/**
 * 
 * Questa classe fornisce i metodi per l'inizializzazione nonchè connessione da parte
 * del client,viene utilizzata principalmente dalla classe UIClient
 * 
 * @author Danilo Scarci
 * 
 */

public class MainTest {
	
	
	PrintWriter output;
	BufferedReader input;
	ObjectInputStream in;
	Socket sock;
	String text;
	
	public MainTest(String ipAddress,int porta) throws UnknownHostException, IOException {
		
		
		Scanner tastiera = new Scanner(System.in);
		String localHost = "localhost";
		int portaConnessione = porta;
		String indirizzoIp;
		if(localHost.equalsIgnoreCase(ipAddress)) {
			String locConnection = localHost;
			this.sock = new Socket(locConnection,porta);
		}
		else {
			indirizzoIp = ipAddress;
			this.sock = new Socket(indirizzoIp,porta);
		}
		
		this.output = new PrintWriter(this.sock.getOutputStream(),true);
		this.input = new BufferedReader(new InputStreamReader(this.sock.getInputStream()));

	}
	
	public void Lettura() throws ClassNotFoundException, IOException {
		output.write(2);
		output.flush();
		in = new ObjectInputStream(this.sock.getInputStream());
		Data dati = (Data) this.in.readObject();
		KMeansMiner kmeans = (KMeansMiner) this.in.readObject();
		//System.out.println(kmeans.getC().toString(dati));       
		this.text = kmeans.getC().toString(dati);
	}
	
	public void Scoperta() throws IOException {
		output.write(1);
		output.flush();
		
	}
	
	
}