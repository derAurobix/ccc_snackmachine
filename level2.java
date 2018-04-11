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
						
			
			
			System.out.print("CHANGE "+ auswurf);
		}
		if(einwurf < Betrag) {
			int einfwurffehlend  = Betrag - einwurf;
			System.out.print("MISSING " + einfwurffehlend);
		}
		
	}
  }

