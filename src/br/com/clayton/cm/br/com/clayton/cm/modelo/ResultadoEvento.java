package br.com.clayton.cm.br.com.clayton.cm.modelo;

public class ResultadoEvento {
	
	private final boolean ganhou;

	public ResultadoEvento(boolean ganhou) {
		this.ganhou = ganhou;
	}

	public boolean isGanhou() {
		return ganhou;
	}
}
