package model.service;

public interface ServicoDePagamentoOnline {
	
	double taxaDePagamento(Double valor);
	
	double taxaDeJuros(Double valor, Integer quantiadeDemeses);

}
