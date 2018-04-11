package ccc_snackmachine;

public class level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int[anzahlMuenzen];
		
		for(int m = 0; m < anzahlMuenzen;m ++) {
			int offset = 2;
			muenzen[m] = Integer.parseInt(args[offset + m]);
			
		}
		int einwurf = 0;
		
		for(int n = 0; n< anzahlMuenzen; n++) {
			 einwurf += muenzen[n];
		}
		
		if(einwurf > Betrag) {
			int auswurf = einwurf - Betrag;		
						
			int Restauswurf200 = auswurf%200;
			System.out.println(Restauswurf200);
			int Restauswurf100 = Restauswurf200%100;
			System.out.println(Restauswurf100);
			int Restauswurf50 = auswurf%50;
			System.out.println(Restauswurf50);
			int Restauswurf20 = auswurf%20;
			System.out.println(Restauswurf20);
			int Restauswurf10 = auswurf%10;
			System.out.println(Restauswurf10);
			int Restauswurf5 = auswurf%5;
			System.out.println(Restauswurf5);
			int Restauswurf2 = auswurf%2;
			System.out.println(Restauswurf2);
			int Restauswurf1 = auswurf%1;
			System.out.println(Restauswurf1);
						
			
			
			
			
			System.out.print("CHANGE "+ auswurf);
		}
		if(einwurf < Betrag) {
			int einfwurffehlend  = Betrag - einwurf;
			System.out.print("MISSING " + einfwurffehlend);
		}
		
	}
  }

