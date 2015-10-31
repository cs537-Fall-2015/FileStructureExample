package main;

/*	
 * Created by: 	Jonathan Young
 * Date: 		May 14, 2015
 * 
 * Update by: 	Richard Cross
 * Date:		Oct 20, 2015
 */

//import generic.RoverThreadHandler;
//
//import java.io.IOException;
//
//import json.Constants;
//import moduleBOB.ModuleBOBClient;
//import moduleBOB.ModuleBOBServer;
//import moduleRoverControl.RoverControlClient;
//import moduleRoverControl.RoverControlServer;
//import moduleSUE.ModuleSUEClient;
//import moduleSUE.ModuleSUEServer;
//
//public class MasterMain {
//
//	public static void main(String[] args) {
//
//		//Each module has its own port
//		int port_RoverControl = Constants.PORT_ONE;
//		int port_BOB = Constants.PORT_TWO;
//		int port_SUE = Constants.PORT_THREE;
//
//		try {
//
//			// create a thread for Rover Control Server
//			RoverControlServer severOne = new RoverControlServer(port_RoverControl);
//			Thread rover_Control_Server = RoverThreadHandler.getRoverThreadHandler().getNewThread(severOne);
//
//			// create a thread for Module BOB
//			ModuleBOBServer severTwo = new ModuleBOBServer(port_BOB);
//			Thread server_BOB = RoverThreadHandler.getRoverThreadHandler().getNewThread(severTwo);
//
//			// create a thread for Module SUE
//			ModuleSUEServer severThree = new ModuleSUEServer(port_SUE);
//			Thread server_SUE = RoverThreadHandler.getRoverThreadHandler().getNewThread(severThree);
//
//			// each server begins listening
//			rover_Control_Server.start();
//			server_BOB.start();
//			server_SUE.start();
//
//			// Setting up clients for communication sockets
//			// creates star network around the RoverControl module
//
//			// Client BOB sending messages to Rover Control Port
//			ModuleBOBClient clientOne = new ModuleBOBClient(port_RoverControl, null); // notice port_RoverControl
//			Thread client_BOB_to_Rover = RoverThreadHandler.getRoverThreadHandler().getNewThread(clientOne);
//
//			// Client SUE sending messages to Rover Control Port
//			ModuleSUEClient clientTwo = new ModuleSUEClient(port_RoverControl, null); // notice port_RoverControl
//			Thread client_SUE_to_Rover = RoverThreadHandler.getRoverThreadHandler().getNewThread(clientTwo);
//
//			
//			RoverControlClient clientThree = new RoverControlClient(port_BOB, null); // notice port_BOB
//			Thread client_Rover_to_BOB = RoverThreadHandler.getRoverThreadHandler().getNewThread(clientThree);
//
//			
//			RoverControlClient clientFour = new RoverControlClient(port_SUE, null); // notice port_SUE
//			Thread client_Rover_to_SUE = RoverThreadHandler.getRoverThreadHandler().getNewThread(clientFour);
//
//			// start the thread which communicates through sockets
//			client_BOB_to_Rover.start();
//			client_SUE_to_Rover.start();
//			client_Rover_to_BOB.start();
//			client_Rover_to_SUE.start();
//		} 
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//}
