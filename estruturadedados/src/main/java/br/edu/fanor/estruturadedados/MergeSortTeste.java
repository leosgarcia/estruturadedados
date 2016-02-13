package br.edu.fanor.estruturadedados;

import java.time.Duration;
import java.time.Instant;

public class MergeSortTeste {

	public static void main(String[] args) {
		
		int[] vetor = {9,8,7,6,5,4,8,7,6,3,9,8,2,1,0,7,6,5,8,7,6,4,9,8,3,2,1};
		
		MergeSort merge = new MergeSort();
		
		Instant inicio = Instant.now();
		merge.mergeSort(vetor, 0, vetor.length - 1);
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);
		System.out.println("O problema foi resolvido em " + duracao.toMillis() + " ms.");
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
