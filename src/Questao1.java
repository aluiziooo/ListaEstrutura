import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario = 0, aumento=0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o sal�rio do funcion�rio");
		salario = leitor.nextFloat();
		System.out.println("Digite o percentual do aumento");
		aumento = leitor.nextFloat();
		salario = salario + (aumento*salario);
		System.out.println("o sal�rio com o aumento �: "+salario+" o aumento foi de: "+aumento);

	}

}
