import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com o valor do seu salario bruto");
		double bruto = leitor.nextDouble();
		double teto = bruto*0.3;
		System.out.println("Digite o valor da prestação a ser agregado ao salario ");
		double prestacao = leitor.nextDouble();
		if(prestacao > teto){
			System.out.println("O valor da prestação ultrapassa o teto estabelecido que é de até 30% do salario bruto do cliente!");
		}
		else{
			System.out.println("Emprestimo realizado com sucesso!!!");
		}

	}

}
