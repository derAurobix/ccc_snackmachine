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
						
			auswurf /= 200;
			if(auswurf < 0) {
				
			}
			/*int auswurf100 = auswurf/100;
			int auswurf50 = auswurf/50;
			int auswurf20 = auswurf/20;
			int auswurf10 = auswurf/10;
			int auswurf5 = auswurf/5;
			int auswurf2 = auswurf/2;
			int auswurf1 = auswurf/1;
			
			int Restauswurf200 = auswurf%200;
			int Restauswurf100 = auswurf%100;
			int Restauswurf50 = auswurf%50;
			int Restauswurf20 = auswurf%20;
			int Restauswurf10 = auswurf%10;
			int Restauswurf5 = auswurf%5;
			int Restauswurf2 = auswurf%2;
			int Restauswurf1 = auswurf%1;
						
						
			
			
			System.out.println("CHANGE1 "+ auswurf1);
			System.out.println("CHANGE2 "+ auswurf2);
			System.out.println("CHANGE5 "+ auswurf5);
			System.out.println("CHANGE10 "+ auswurf10);
			System.out.println("CHANGE20 "+ auswurf20);
			System.out.println("CHANGE50 "+ auswurf50);
			System.out.println("CHANGE100 "+ auswurf100);
			System.out.println("CHANGE200 "+ auswurf200);
			*/
			
			
			System.out.print("CHANGE "+ auswurf);
		}
		if(einwurf < Betrag) {
			int einfwurffehlend  = Betrag - einwurf;
			System.out.print("MISSING " + einfwurffehlend);
		}
		
	}
  }

