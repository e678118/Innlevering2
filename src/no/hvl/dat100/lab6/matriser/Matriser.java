package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
		public static void skrivUt(int[][] matrise) {
			
			// TODO
			//throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
			for (int i = 0; i < matrise.length; i++) {
	            for (int j = 0; j < matrise[i].length; j++) {
	                System.out.print(matrise[i][j] + " ");
	            }
	            System.out.println();  
	        }
		}

		// b)
		public static String tilStreng(int[][] matrise) {
		    String resultat = "";

		    for (int i = 0; i < matrise.length; i++) {
		        for (int j = 0; j < matrise[i].length; j++) {
		            resultat += matrise[i][j] + " ";


		        }
		        resultat += "\\n";  // Legg alltid til linjeskift etter hver rad
		    }

		    return resultat;
		    
		}
		// c)
		public static int[][] skaler(int tall, int[][] matrise) 
		{
				
				int[][] nyMatrise = new int[matrise.length][matrise[0].length]; 
				
				// TODO
				//throw new UnsupportedOperationException("Metoden skaler ikke implementert");
				for (int i = 0; i < matrise.length; i++) 
				{
			        for (int j = 0; j < matrise[i].length; j++) 
			        {
			        nyMatrise[i][j] = tall * matrise[i][j];
			
			        }
			        
				}
				return nyMatrise; 
		}
			

		// d)
		public static boolean erLik(int[][] a, int[][] b) {

			// TODO
			//throw new UnsupportedOperationException("Metoden erLik ikke implementert");
			if( a.length != b.length) {
				return false; 
			} 
			else if (a[0].length != b[0].length)
			{ 
				return false; 
			}
			
			for (int i = 0; i < a.length; i++) 
			{
		        for (int j = 0; j < a[i].length; j++) 
		        {
		        	if (a[i][j] != b[i][j]) 
		        	{
		        	return false; 
		        	} 
		        
		        }
			 
			}
			return true;
		}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
