package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.service.ContratoService;

public class Contrato {
	
	private Integer number;
	private Date data;
	private Double valorTotal;
	
	
	List<Prestacao> lista = new ArrayList<>();
	
	public Contrato() {
	}

	public Contrato(Integer number, Date data, Double valorTotal) {
		this.number = number;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Prestacao> getLista() {
		return lista;
	}
	
	public void addPrestacao (Prestacao prestacao) {
		lista.add(prestacao);
	}
	
	public void removePrestacao(Prestacao prestaca) {
		lista.remove(prestaca);
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

}
