import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		Scanner leitor = new Scanner(System.in);
		int litros = 0;
		double total;
		double preco_litro = 2.50;
		
		System.out.println("Digite o total de litros ");
		litros = leitor.nextInt();
		total = litros*preco_litro;
		System.out.println("TOTAL: R$ "+total+" reais, se comprou algo extras digite o valor e ele será somado(se não tiver nada digite 0): ");
		double extra = leitor.nextDouble();
		total += extra;
		System.out.println("Valor final:R$ "+total+" reais");

	}

}
