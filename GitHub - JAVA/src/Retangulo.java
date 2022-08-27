import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
        diagonal = 	Math.sqrt(Math.pow(base,  2.0) + Math.pow(altura,  2.0)); // Math -> � o nome da classe que ir� chamar ex. sqrt � para divis�o// 
        //diagonal = raiz quadrada de (base ^ 2 + altura ^ 2)//
        
        System.out.println("Area = " + String.format("%.4f", area));
        System.out.println("Perimetro = " + String.format("%.4f", perimetro));
        System.out.println("Diagonal = " + String.format("%.4f", diagonal));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();
	
		

	}

}
