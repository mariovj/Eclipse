
public class WordCounter2 {

	public static void main(String[] args) {
		String [] nombres = {"Fernado","Aurelio","Juana","Camilo", "Anastasia"};
		int result = Integer.parseInt("5");
		
		for (int i = 0; i<nombres.length;i++) {
			if (nombres[i].length() == result) {
				System.out.println(nombres[i]);
			}
		}

	}

}
