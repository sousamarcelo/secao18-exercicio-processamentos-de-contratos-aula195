package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataVencimento;
	private Double valor;
	
	public Prestacao() {
	}

	public Prestacao(Date dataVencimento, Double valor) {
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() { 
		return sdf.format(getDataVencimento())  +  " - " + String.format("%.2f", getValor()) ;
	}
	
}
