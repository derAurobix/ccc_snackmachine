package ccc_snackmachine;

public class level_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int[anzahlMuenzen];
		
		for(int m = 0; m < anzahlMuenzen;m ++) {
			int offset = 2;
			muenzen[m] = Integer.parseInt(args[offset + m]);			
		}
		
	}

}
