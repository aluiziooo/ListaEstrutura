import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");//o uso dessa classe determina um padrão para a vizualização de qualquer numero
													//float ou doble em que ela vai ser usada, é importante ressaltar que ele retorna uma
													//String.
		float[] medias = new float[6];
		int i;
		float classe = 0;
		
		for(i=0;i<6;i++){
			System.out.println("Digite a primeira nota do aluno "+(i+1));
			float nota1 = leitor.nextFloat();
			System.out.println("Digite a segunda nota do aluno "+(i+1));
			float nota2 = leitor.nextFloat();
			
			medias[i] = (nota1+nota2)/2;
			classe += medias[i];//DAR A MEDIA DA CLASSE
			
		}
		int A = 0,R = 0,E = 0;
		//A == aprovado//R == reprovado//E == em recuperação 
		for(i=0;i<6;i++){
			if(medias[i] < 3){
				System.out.println("Aluno "+(i+1)+"Sua media foi:"+medias[i]+" | Você está reprovado!");
				R += 1;
			}
			else if(medias[i] < 7){
				System.out.println("Aluno "+(i+1)+"Sua media foi:"+medias[i]+" | Você está em recuperação!!!");
				E += 1;
			}
			else if(medias[i] <= 10){
				System.out.println("Aluno "+(i+1)+"Sua media foi:"+medias[i]+" | Você está Aprovado!!!!!");
				A += 1;
			}
		}
		System.out.println("\nVisão geral da sala");
		System.out.println("-------------------");
		System.out.println("Total de alunos Aprovados: "+A);
		System.out.println("Total de alunos em Recuperação: "+E);
		System.out.println("Total de alunos Reprovados: "+R);
		System.out.println("Media da classe: "+df.format((classe/6)));
		
	}

}
