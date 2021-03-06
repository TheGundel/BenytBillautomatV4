package automat;

public class TjekBilletautomatBilletUdenPenge
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();
		int antalFejl = 0;
		int retur;
		
		retur = automat.getBilletpris();
		
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}

		System.out.println("*** Tjek af salg af en billet");
		automat.indsætPenge(-10);
		automat.udskrivBillet(); // Udskriver en billet selvom balacen er 0kr. 
		retur = automat.returpenge(); // Giver en et negativ beløb tilbage
		if (retur != 0) {
			System.out.println("FEJL, returpenge() skulle give 0, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}

		
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");			
		}
		
	}
	
	
}