import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitorStr = new Scanner(System.in);
		Scanner leitorInt = new Scanner(System.in);
		int i;
		int qtd_cliente;
		double total = 0,tot_diaria;
		System.out.println("Quantos clientes irão entrar na conta? ");
		qtd_cliente = leitorInt.nextInt();
		while(qtd_cliente > 0 ){
			System.out.println("Informe o nome do cliente: ");
			String nome = leitorStr.nextLine();
			System.out.println("Quantos dias o(a) "+nome+" se hospedou? ");
			int dias = leitorInt.nextInt();
			tot_diaria = dias*40;
			if (dias < 10){
				tot_diaria +=15;
				System.out.println("Cliente: "+nome+" | Total: "+tot_diaria);
			}
			else{
				tot_diaria +=8;
				System.out.println("Cliente: "+nome+" | Total: "+tot_diaria);
			}
			total += tot_diaria;
			for(i =0; i <20; i++){
				System.out.println();
			}
		}
		System.out.println("Ganho total do hotel: R$ "+total);

	}

}
