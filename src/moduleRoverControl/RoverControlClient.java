package moduleRoverControl;

/*	
 * Created by: 	Jonathan Young
 * Date: 		May 14, 2015
 */

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

import json.Constants;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import generic.RoverClientRunnable;

//public class RoverControlClient extends RoverClientRunnable{
//
//	public RoverControlClient(int port, InetAddress host)
//			throws UnknownHostException {
//		super(port, host);
//	}
//	
//	ObjectOutputStream outputToModule = null;
//    ObjectInputStream inputFromModule = null;
//
//	@Override
//	public void run() {
//		try{
//
//		    //Thread.sleep(5500);
//		    //for sending messages to module server
//		    outputToModule = new ObjectOutputStream(getRoverSocket().getNewSocket().getOutputStream());
//		    //read the module server response message
//            inputFromModule = new ObjectInputStream(getRoverSocket().getSocket().getInputStream());
//		    
//            
//            //Send 4 commands to the Server
//	        for(int i = 0; i < 4; i++){
//	           
//            //System.out.println("=================================================");
//	            System.out.println("Rover Control Client: Sending request to Socket Server");
//	            //System.out.println("=================================================");
//	            
//	            if(i == 3){
//	            	outputToModule.writeObject("exit");
//	            }
//	            else if(i == 2) {
//	            	outputToModule.writeObject("MODULE_TWO_GET");
//	            }
//	            else if(i == 1) {
//	            	outputToModule.writeObject("MODULE_ONE_DO_SOMETHING");
//	            }
//	            else if(i == 0) {
//	            	outputToModule.writeObject("MODULE_PRINT");
//	            }
//	            
//	           
//	            String message = (String) inputFromModule.readObject();
//	            System.out.println("Rover Control Client: Message from Server - " + message.toUpperCase());
//	            
//	            // The server sends us a JSON String here
//	            String jsonString = (String) inputFromModule.readObject();
//	            System.out.println("Rover Control Client: Message from Server - " + jsonString.toUpperCase());
//	            
//	            // We can then parse the JSON String into a JSON Object
//	            JSONParser parser = new JSONParser();
//	            JSONObject jsonObject = (JSONObject) parser.parse(jsonString);
//	            
//	            Long oldLong = (Long) jsonObject.get("myInteger");
//				
//				// Pass the long back into an integer
//				Integer myInteger = new Integer(oldLong.intValue());
//				
//				boolean myBoolean = (boolean) jsonObject.get("myBoolean");
//				double myDouble = (double) jsonObject.get("myDouble");
//				long myLong = (long) jsonObject.get("myLong");
//				String myString = (String) jsonObject.get("myString");
//				
//				System.out.println("");
//				System.out.println("<Start> Rover Control Client now has: <Start>");
//				System.out.println("===========================================");
//				System.out.println("This is Class Rover Control " + Constants.ONE + "'s object ");
//				System.out.println("myInteger = " + myInteger);
//				System.out.println("myBoolean = " + myBoolean);
//				System.out.println("myDouble = " + myDouble);
//				System.out.println("myLong = " + myLong);
//				System.out.println("myString = " + myString);
//				System.out.println("===========================================");
//				System.out.println("<End> Rover Control Client now has: <End>");
//				System.out.println("");
//	            
//	            //close resources
//	            inputFromModule.close();
//	            outputToModule.close();
//	            Thread.sleep(7500);
//	        }
//	        closeAll();
//		}	        
//        catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (Exception error) {
//			System.out.println("Rover Control Client: Error:" + error.getMessage());
//		}
//	}
//
//	public void send(){
//		
//	}
//	
//}
