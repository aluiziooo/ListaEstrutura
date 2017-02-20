import java.util.Scanner;

public class Questao9 {
	//CODIGO BUNITO DA POXA, AINDA FALTA MELHORAR COLOCANDO MENSAGENS DE SEGURANÇA PRA NÃO ESTOURAR ERRO NA FACE DO USUARIO
	public static int media(int soma,int num){
		if(soma == 0 || num == 0){
			return 0;
		}
		else{
			return soma/num;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitorStr = new Scanner(System.in);//Aqui fiz 3 leitores pq tive problema na captura de dados, vi num forum que
		Scanner leitorInt = new Scanner(System.in);//O problema seria um nextInt depois do nextLine ai eu fiz isso e deu certo.
		Scanner leitorfloat = new Scanner(System.in);
		
		//Paciente tem nome, idade, peso,sexo e altura
		String nome,sexo;
		int idade,contador = 0;
		float peso, altura;
		//exibir um relatorio com: Quantidade de pacientes
		//media de idade dos homens;
		int media_idade_H = 0, cont_homem = 0,soma_idade_H = 0;
		//quantidade de mulher com altura entre 1,60 e 1,70 e peso acima de 70kg;
		int qtd_mulher = 0;
		//numero de pssoas com idade entre 18-25
		int numPessoas = 0;
		//nome do paciente mais velho
		int maisvelho = 0;
		String nomevelho = null;
		//nome da mulher mais baixa;
		float maisbaixa = 3;
		String nomedamaisbaixa = null;
		//Variavel para comparação e interpção de loop
		String fim = "fim";
		while(true){
			System.out.println("Qual o nome do paciente? ");
			nome = leitorStr.nextLine();
			if(nome.equals(fim)){//Aqui de inicio não tava pegando, tava tentando igualar ("==") Strings, e não funciona por Strings não 
				break;			//São os valores literais e sim uma referencia ao objeto criado que armazena os literais, é como um tipo especial de array
			}
			System.out.println("Qual o sexo? M - Masculino | F - Feminino");
			sexo = leitorStr.nextLine();
			System.out.println("Sua idade");
			idade = leitorInt.nextInt();
			System.out.println("Seu peso");
			peso = leitorfloat.nextFloat();
			System.out.println("Sua altura");
			altura = leitorfloat.nextFloat();
			if(sexo == "M" || sexo == "m"){
				soma_idade_H += idade;
				cont_homem+=1;
				if(idade > maisvelho){
					maisvelho = idade;
					nomevelho = nome;
					
				}
			}
			
			else if(sexo == "F" || sexo == "f"){
				if(altura > 1.60 && altura < 1.80 && peso > 70){	
					qtd_mulher += 1;
				}
				if(altura < maisbaixa ){
					maisbaixa = altura;
					nomedamaisbaixa = nome;
				}
			}
			if (idade > 18 && idade < 25){
				numPessoas +=1;
			}
			
			
			contador += 1;
		}
		media_idade_H = media(soma_idade_H,cont_homem);//Aqui resolvi criar um metodo para realizar a conta por que se caso o programa se
		System.out.println("Numeros de Pessoas: "+contador);//o as variaveis terminasse com 0 depois do loop eles iriam dá erro pois 0/0 ou n/0 é uma inderteminação e daria erro
		System.out.println("Media de idade dos homens: "+media_idade_H);
		System.out.println("Quantidade de mulheres entre 1,60-170 com mais de 70 kg: "+qtd_mulher);
		System.out.println("Nome do homem mais velho: "+nomevelho);
		System.out.println("Nome da mulher mais baixa: "+nomedamaisbaixa);
		

	}

}
