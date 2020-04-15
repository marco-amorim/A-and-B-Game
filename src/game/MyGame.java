package game;

import java.io.*;
import java.util.*;

public class MyGame {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);

		// Lê o tamanho informado pelo usuario e adiciona em uma variavel
		System.out.println("Por favor, informe o tamanho da sua lista");
		int n = Integer.parseInt(br.readLine().trim());

		// Lê os valores que entrarao na lista e guarda em uma variavel
		System.out.println("Por favor, informe os numeros da sua lista separados por espaço");
		String[] arr_arr = br.readLine().split(" ");

		// Cria o vetor com o tamanho informado pelo Usuário
		int[] arr = new int[n];

		// Itera pelo vetor criado para adicionar os elementos informados pelo Usuário
		for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {

			arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
		}

		int[] saida = funGame(arr);

		// Mostra o primeiro elemento para nao ficar com espaço na frente
		System.out.print(saida[0]);

		// Itera os outros elementos partindo do index 1
		for (int i = 1; i < saida.length; i++) {
			System.out.print(" " + saida[i]);
		}

		wr.close();
		br.close();
	}

	static int[] funGame(int[] arr) {

		// Criação da pilha
		Stack<Integer> pilha = new Stack<Integer>();

		// Fila para o controle dos elementos que serao removidos
		Queue<Integer> fila = new LinkedList<Integer>();

		// Lista de saida
		List<Integer> listaSaida = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			pilha.push(arr[i]);
			fila.add(arr[i]);
		}

		while (!pilha.isEmpty() && !fila.isEmpty()) {

			// Peek da Fila é o primeiro elemento
			int a = fila.peek();

			// Peek da Pilha é o último elemento
			int b = pilha.peek();

			// Lógica de comparação entre eles, seguindo o enunciado do problema
			if (a > b) {
				// Remove da Pilha
				pilha.pop();
				// Adiciona 1 à Lista de saida
				listaSaida.add(1);
			} else if (a < b) {
				// Remove da Fila
				fila.remove();
				// Adiciona 2 à Lista de saida
				listaSaida.add(2);
			} else {
				// Adiciona 2 à Lista de saida
				listaSaida.add(0);
				// Remove da Pilha
				pilha.pop();
				// Remove da Fila
				fila.remove();
			}
		}

		// Cria e itera a nossa variavel de saida
		int out[] = new int[listaSaida.size()];
		for (int i = 0; i < listaSaida.size(); i++) {
			out[i] = listaSaida.get(i);
		}
		// Retorna os resultados do jogo
		System.out.println("A lista de saída é:");
		return out;
	}

}