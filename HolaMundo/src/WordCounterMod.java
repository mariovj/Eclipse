
public class WordCounterMod {

	public static void main(String[] args) {
		
		try { 
			
			String [] Nombres = {"Fernado","Aurelio","Juana","Camilo", "akdltes","Clara"};
			int result = Integer.parseInt("5");
			
			for (int i = 0; i<Nombres.length;i++) {
				if (Nombres[i].length() == result && Nombres[i].contains("a")) {
					System.out.println(Nombres[i]+ " s� cumple con los par�metros establecidos.");
				}else{System.out.println(Nombres [i] + " no cumple con los par�metros establecidos.");
				}
			}
		}
		
		catch (Exception e){
		
			System.out.println("Error en la ejecuci�n.");
		}
		
		finally{
			System.out.println("Fin del juego.");
		}
	}
}

