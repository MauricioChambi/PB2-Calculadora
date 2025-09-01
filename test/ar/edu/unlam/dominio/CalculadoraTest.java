package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void dadoQueExisteUnaCalculadoraConDosNumerosPodremosHacerLaSumaDeEstos() {
		
		Calculadora casio = new Calculadora();

		Double resultadoDeLaSuma = casio.sumar(10.0, 10.0);
		Double resultadoTest = 20.0;

		assertEquals(resultadoTest, resultadoDeLaSuma);
	}
	@Test
	public void dadoQueExisteUnaCalculadoraConDosNumerosPodremosHacerLaRestarDeEstos() {
		
		Calculadora casio = new Calculadora();
		
		Double resultadoDeLaSuma = casio.restar(10.0, 10.0);
		Double resultadoTest = 0.0;
		
		assertEquals(resultadoTest, resultadoDeLaSuma);
	}
	@Test
	public void dadoQueExisteUnaCalculadoraConDosNumerosPodremosHacerLaMultiplicacionDeEstos() {
		
		Calculadora casio = new Calculadora();
		
		Double resultadoDeLaSuma = casio.multiplicar(10.0, 10.0);
		Double resultadoTest = 100.0;
		
		assertEquals(resultadoTest, resultadoDeLaSuma);
	}
	@Test
	public void dadoQueExisteUnaCalculadoraConDosNumerosPodremosHacerLaDivisionDeEstos() {
		
		Calculadora casio = new Calculadora();
		
		Double resultadoDeLaSuma = casio.dividir(10.0, 10.0);
		Double resultadoTest = 1.0;
		
		assertEquals(resultadoTest, resultadoDeLaSuma);
	}	
	
}
