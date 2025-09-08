package ar.edu.unlam.dominio;

import java.util.Objects;

public class Carga {

	private Long id;
	private Double peso;
	
	public Carga(Long id, Double peso) {
		this.id = id;
		this.peso = peso;
	}
	
	public Carga(Double peso) {
		this.peso = peso;
	}
	
	public Double getPeso() {
		// TODO Auto-generated method stub
		return this.peso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carga other = (Carga) obj;
		return Objects.equals(id, other.id) && Objects.equals(peso, other.peso);
	}

	
	
	
}
