package br.com.clayton.cm.br.com.clayton.cm.modelo;

@FunctionalInterface
public interface CampoObservador {

	public void eventoOcorreu(Campo campo, CampoEvento envento);
}
