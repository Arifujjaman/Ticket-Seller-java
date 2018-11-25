package main;

import java.util.Scanner;

public class TicketSeller {
	
	
	public static int allticket=100;
	public static int calculate(int t) {
	allticket -=t;
	return allticket;
	}
			

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int allticket=100;
		int buyer=0;
		int sold=0;
		while(sold<allticket) {
			int t=in.nextInt();
			
			if(t>4) {
				System.out.println("buyer can buy maximun 4 tickets");
				continue;
			}
			else if(t>(allticket-sold)) {
				System.out.println("remaining ticket : "+(allticket-sold));
				continue;
			}
			
			buyer++;
			sold=sold+t;
			System.out.println("remaining ticket : "+(allticket-sold));
		}
		System.out.println("total buyer :"+buyer);

	}

}
