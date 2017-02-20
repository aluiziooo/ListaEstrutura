import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Um aplicativo para mostrar a tabuada que o cidadão veja.
		//criar as variaveis
		Scanner leitor = new Scanner(System.in);
		int i,num;
		//inicializar as variaveis
		System.out.println("Qual é a tabuada que você deseja ver? : ");
		num = leitor.nextInt();
		//capturar os valores
			//fazer um for para gerar a tabuada e por fim exibir os valores 
		for(i = 1; i <101;i++){
			int resul = num*i;
			System.out.println(num+" x "+i+" = "+resul);
		}

	}

}
