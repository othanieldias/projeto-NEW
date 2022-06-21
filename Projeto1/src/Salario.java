import java.util.Scanner;

public class Salario {
public static void main(String[] args) {
	double SalarioMinimo = 788;
	double SalarioUsuario;
	double SalarioMinimoTotal;
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("insira o valor do salario do usuario:");
	SalarioUsuario = input.nextDouble();
	SalarioMinimoTotal = SalarioUsuario / SalarioMinimo;
	System.out.println("O usuário recebe " + SalarioMinimoTotal + " salários.");
}
}
