package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		List<Purchasers> purchasersList = new ArrayList<Purchasers>();
		List<Items> itemsList = new ArrayList<Items>();
		List<Auction> auctionList = new ArrayList<Auction>();
		String ca;
		CommandApp.CommandMenu();

		do {
			// ask the user to enter a command
			ca = CommandApp.keyboardScan();

			// process the command entered by the user
			CommandApp.commandsAction(ca,purchasersList,itemsList,auctionList);
		} while (!ca.equals("exit"));

	}
}

