package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner leitor = new Scanner (System.in);
		//Criando um objeto do tipo ArrayList
		
		ArrayList<String> estoque = new ArrayList();

		do {
			//Menu do usuário
			System.out.println("\n--------------------------------------------");
			System.out.println("\n\t\tMenu de opções do Estoque:");
			System.out.println("\n(1) Deseja adicionar produtos no estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar algum produto do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.println("\nPor favor, digite sua opção: ");
			
			op = leitor.nextInt();
			
			//Escolhendo opções do menu
			
			switch(op) {
			case 1:
				leitor.nextLine();// nextLine() - Lê um valor do tipo String - ele vazio limpa a memória cache
				System.out.println("\nDigite o produto para adicionar no estoque:");
				String produto = leitor.nextLine();//lê o produto que o usuário acabou de digitar
				estoque.add(produto); // adicionando o produto no ArrayList estoque
				System.out.println(estoque);
				break;
			case 2:
				leitor.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque:");
				System.out.println(estoque);
				String produto1 = leitor.nextLine();
				//contains() - verifica se dentro da collection contém o elemento passado como argumento (nesse caso o produto1)
				if(estoque.contains(produto1)) {
					estoque.remove(produto1);//remove o produto informado pelo usuário
					System.out.println(estoque);
				}else{
					System.out.println("\nO produto informado não existe no estoque");
				}
				break;
			case 3:
				leitor.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = leitor.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do:" + verifica + ":");
				String novo =  leitor.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);//removendo produto informado em verifica
					estoque.add(novo);//substituindo pelo produto informado em novo
					System.out.println(estoque);
				}else {
					System.out.println("O produto informado não existe no nosso estoque");
				}
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são:" );
				System.out.println(estoque);//mostrando produtos do estoque
				break;
			case 0:
				System.out.println("\nObrigada por utilizar nosso sitema!");
				break;
			default:
				System.out.println("\nOpção Inválida!!!!!");
			}
			op = leitor.nextInt();
		}while(op!=0);
		
	}

}
