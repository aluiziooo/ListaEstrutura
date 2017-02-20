import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < 10; i++){
			int num = 0;
			System.out.println("Digite o "+(i+1)+"º numero inteiro: ");
			num = input.nextInt();
			if (num%2 == 0){
				System.out.println("Esse numero é par!");
			}
			else{
				System.out.println("Esse numero é impar!!");
			}
				
				
		}

	}

}
