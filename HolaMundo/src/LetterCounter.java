
public class LetterCounter {

	public static void main(String[] args) {
		
		String[] array = {"Hola","comida","jartá","reir"};
		
		String resultado = "";
		
		for(int i= 0; i < array.length; i++) {
			
			resultado = array[i] + " ";
			
			System.out.print(resultado);
			System.out.println(resultado.length());
			
		}

		String[] lolita = {"Sarandonga","nos","vamos","a","comer"};
		
				for (String j:lolita) {
			System.out.print(" " + j + " ");
			System.out.print(j.length()); //He puesto esto para que cuente cada elemento del array
			
		}
	}

}

