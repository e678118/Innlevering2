package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
		public static void skrivUt(int[] tabell) { 
		
			for(int i=0; i<tabell.length; i++)
				System.out.println(tabell[i]);
				
				}

		// b)
		public static String tilStreng(int[] tabell) {
			
			String resultat = ""; 

			for (int i = 0; i < tabell.length; i++) {
			    resultat += tabell[i];
			    if (i < tabell.length - 1) {
			        resultat += ", ";
			    }
			}

			return resultat; 
					   
		    }
			

	// c)
	public static int summer(int[] tabell) {

		int sum=0;
		for(int i=0; i<tabell.length; i++)  
			
			sum+=tabell[i];
	
		return sum;
		}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int i=0; i<tabell.length;i++) {
			if(tabell[i]==tall) { 
				return true;
		}
		}
			return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for(int i=0; i<tabell.length;i++) {
			if(tabell[i]==tall) {
				return i;
			}
		}
			return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
			int []nytabell=new int[tabell.length];
			
			for(int i=tabell.length-1; i>=0;i--) 
				{
				nytabell[(tabell.length-1)-i]=tabell[i];
				}
			return nytabell;
			}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i=1;i<tabell.length;i++) {
			if(tabell[i]<tabell[i-1]) {
			
			return false;
			}
			}
			return true;
			}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde=tabell1.length + tabell2.length;
		int []sammen= new int [nyLengde];
		for(int i=0;i<tabell1.length;i++) {
			sammen[i]=tabell1[i];
		}
		for(int j=0; j<tabell2.length;j++) {
			sammen[tabell1.length+j]=tabell2[j];
		}
		return sammen;
}
}
