package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Prestacao;

public class ContratoService {
	
	ServicoDePagamentoOnline servicoDePagamentoOline;	
	
	public ContratoService(ServicoDePagamentoOnline servicoDePagamentoOline) {
		this.servicoDePagamentoOline = servicoDePagamentoOline;
	}

	public void processandoContrado(Contrato contrato, Integer quantidadeDeMeses) {		
		Double valorCota = contrato.getValorTotal() / quantidadeDeMeses;
		for(int i = 1; i <= quantidadeDeMeses; i++) {
			Double valorCotaComTaxaJuros = valorCota + servicoDePagamentoOline.taxaDeJuros(valorCota, i);
			Double valorCotaComTaxaPagamento = valorCotaComTaxaJuros + servicoDePagamentoOline.taxaDePagamento(valorCotaComTaxaJuros);
			Date vencimento = incrementaData(contrato.getData(), i);
			contrato.getLista().add(new Prestacao(vencimento, valorCotaComTaxaPagamento));
		}
		
	}
	
	public Date incrementaData(Date date, Integer n) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		ca.add(Calendar.MONTH, n);
		return ca.getTime();
	}

}
