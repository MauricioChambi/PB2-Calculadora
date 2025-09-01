package ar.edu.unlam.dominio;

public class Calculadora {

	public Double sumar(Double numeroUno, Double numeroDos) {
		return numeroUno + numeroDos;
	}

	public Double restar(Double numeroUno, Double numeroDos) {
		return numeroUno - numeroDos;
	}

	public Double multiplicar(Double numeroUno, Double numeroDos) {
		return numeroUno * numeroDos;
	}

	public Double dividir(Double numeroUno, Double numeroDos) {
		return numeroDos == 0.0 ? 0.0 : numeroUno / numeroDos;
	}
}
