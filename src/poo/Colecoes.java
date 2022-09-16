package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Colecoes {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Criando um objeto do tipo List e instanciando o objeto do tipo ArrayList
		//O ArrayList permite repetições de elementos
		List<Integer> minhaLista = new ArrayList<Integer>();
		//Adicionou 6 elementos ao ArrayList
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(7);
		
		
		//percorre desde a primeira posição da List até a última
				for(Integer listaElementos:minhaLista) {
					
					System.out.println(listaElementos);
				}
				
		System.out.println("\nRemovendo um elemento da Lista");
		System.out.println();//limpa a memória cache (execução do sistema)
		minhaLista.remove(0); //remove um elemento da lista a partir do índice
		
		//percorre desde a primeira posição da List até a última
				for(Integer listaElementos:minhaLista) {
					
					System.out.println(listaElementos);
				}
		int primeiroElemento = minhaLista.get(0); //pegando o primeiro elemento da Lista com get
		int posicaoElemento = minhaLista.indexOf(7);
		
		System.out.println("\nQual o primeiro elemento da lista?: " + primeiroElemento);
		System.out.println("\nQual a posição do elemento 7?: " + posicaoElemento);
		System.out.println();
		
		//O método size pega o tamanho da lista
		//O for percorre toda a Lista até seu último elemento
		for(int i=0;i<minhaLista.size();i++) {
			//Imprimindo elemento de acordo com o índice do laço (varíavel i);
			System.out.println("\nElemento:" + minhaLista.get(i));
		}
		//Pegando método sort da Collection 
		//O método sort ordena a List por ordem crescente ou ordem alfabética
		Collections.sort(minhaLista);
		
		System.out.println("\nDepois de ordenada...");
		System.out.println(minhaLista);
		System.out.println();
		
		//Criando a Collection Set
		//Criando um objeto do tipo Set e instanciando como HashSet
		
		//O Set NÃO permite repetições, diferente do ArrayList
		
		//Caso haja repetições dentro dos elementos do Set, ele considera apenas o primeiro elemento informado e ignora os demais
		
		System.out.println("\nMeu Set\n");
		Set<Integer> meuSet =  new HashSet<Integer>();
		
		meuSet.add(5);
		meuSet.add(7);
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(5);// Não adiciona elementos iguais
		
		//O Iterator é uma API de Java, que oferece uma interface que percorre uma coleção de dados derivada da Interface de Collection (HashSet, ArrayList e etc)
		//Organiza e gerencia os elementos da Collection
		
		
		Iterator<Integer> iMeuSet = meuSet.iterator(); //Transformei o meuSet em Iterator
		
		//hasNext() - o método hasNext percorre a Collection e verifica cada elemento para saber se já chegamos no final da coleção 
		
		while(iMeuSet.hasNext()) {
			//next() - retorna ou imprime o próximo elemento; Não precisa de índice para isso.
			System.out.println(iMeuSet.next());
		}	
	}

}
