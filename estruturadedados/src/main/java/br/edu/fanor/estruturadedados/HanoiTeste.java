package br.edu.fanor.estruturadedados;

import java.time.Duration;
import java.time.Instant;

public class HanoiTeste {

	public static void main(String[] args) {
		
		Hanoi hanoi = new Hanoi();
		
		Instant inicio = Instant.now();
		hanoi.hanoi(10, 'A', 'B', 'C');
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);
		System.out.println("O problema foi resolvido em " + duracao.toMillis() + " ms.");
		
		
	}

}
