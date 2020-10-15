package model.service;

public class Paypal implements ServicoDePagamentoOnline {
	
	private static final double TAXA_DE_PAGAMENTO = 0.02;
	private static final double TAXA_DE_JUROS = 0.01;
	

	@Override
	public double taxaDePagamento(Double valor) {		
		return valor * TAXA_DE_PAGAMENTO;
	}

	@Override
	public double taxaDeJuros(Double valor, Integer quantiadeDemeses) {		
		return valor * quantiadeDemeses * TAXA_DE_JUROS;
	}

	

}
