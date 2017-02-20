import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float salario=0;
		String continua = "roda";
		
		while (true) {
			System.out.println("Digite o salario do funcionario: ");
			String var = leitor.nextLine();
			if (var=="fim"){
				break;
			}
			else{
				salario = Float.parseFloat(var);
				if (salario < 500){
					float aumento = (float) (salario + (salario*0.2)); 
					System.out.println("Recebeu o aumento de 20%, Seu salario ficou de: "+aumento);
				}
				else{
					System.out.println("Não receberá aumento, filho da puta!");
				}
				
			}
			
		}

	}

}
