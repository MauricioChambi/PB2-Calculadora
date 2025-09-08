package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class MontaCarga {

	private Double pesoMaximoPermitido;
	private ArrayList<Carga> cargas = new ArrayList<>();
	private HashSet<Carga> cargasSinDuplicado; 
	
	public MontaCarga(Double pesoMaximoPermitido) {
		this.cargasSinDuplicado = new HashSet<>();
		this.pesoMaximoPermitido = pesoMaximoPermitido;
	}
	
	public boolean cargaAgregada(Carga carga) {
		boolean resultado = this.cargasSinDuplicado.add(carga);
		return resultado;
	}
	
	public boolean existe(Carga carga) {
		return this.cargasSinDuplicado.contains(carga);
	}

	public Double getPesoMaximoPermitido() {
		return this.pesoMaximoPermitido;
	}
	
	public void cargar(Carga carga) {
		this.cargas.add(carga);
	}
	
	public Integer obetenerCantidadDeCargas() {
		return this.cargas.size();
	}
	
	public Double obtenerPesoCargado() {
		Double pesoMaximo = 0.0;
		
		for (Carga carga : this.cargas) {
			pesoMaximo += carga.getPeso();
		}
		
		return pesoMaximo;
	}

	public void vaciar() {
		// TODO Auto-generated method stub
		this.cargas.clear();
	}

	public Integer obtenerCantidadDeCargas() {
		// TODO Auto-generated method stub
		return this.cargas.size();
	}
	
	
}
