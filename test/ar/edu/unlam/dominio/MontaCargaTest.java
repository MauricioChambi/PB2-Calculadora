package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MontaCargaTest {

	@Test
	public void test() {
		// Cuando quiero agregar un objeto en la coleccion HashSet si no tengo sobre
		// escrito el hascode
		// Y el equals si tiene mismos parametros lo va a poder agregar, pero si tiene
		// mismos parametros no
		// Lo va a poder agregar aunque sean de distintos new
		Carga carga = new Carga(1L, 100.0);
		Carga otraCarga = new Carga(1L, 300.0);
		MontaCarga montaCarga = new MontaCarga(1000.0);
		boolean cargaResultado = montaCarga.cargaAgregada(carga);
		boolean cargaResultado2 = montaCarga.cargaAgregada(otraCarga);
		assertTrue(cargaResultado);
		assertTrue(cargaResultado2);
	}

	@Test
	public void dadoQueSeHayaCreadoDosInstaciasDeLaCargaYLoAgregemosAlMontaCargasVerificamosSiElMontaCargasContieneEsaCarga() {
		Carga unaCarga = new Carga(10L, 2000.0);
		Carga otraCarga = new Carga(10L, 3000.0);
		Carga ultimaCarga = new Carga(10L, 2000.0);
		
		MontaCarga montaCargas = new MontaCarga(1000.0);
				
		assertTrue(montaCargas.cargaAgregada(unaCarga));
		assertTrue(montaCargas.cargaAgregada(otraCarga));
		assertFalse(montaCargas.cargaAgregada(ultimaCarga));
		
		assertTrue(montaCargas.existe(ultimaCarga));
	}

	@Test
	public void dadoQueNoExisteUnaCargaAlCrearlaLaMismaObtendremosSuPeso() {
		Double peso = 100.0;
		Carga carga = new Carga(peso);
		Double obtenerPesoDeLaCarga = carga.getPeso();
		Double pesoDeLaCargaEsperado = 100.0;
		assertEquals(pesoDeLaCargaEsperado, obtenerPesoDeLaCarga);
	}

	@Test
	public void dadoQueNoExisteUnaMontaCargaAlCrearlaLaMismaObtendremosSuPesoPermitido() {
		Double peso = 100.0;
		MontaCarga montaCarga = new MontaCarga(peso);
		Double pesoMaximoPermitido = montaCarga.getPesoMaximoPermitido();
		Double pesoEsperadoDelMontacargasPermitido = 100.0;
		assertEquals(pesoEsperadoDelMontacargasPermitido, pesoMaximoPermitido);
	}

	@Test
	public void dadoQueExisteUnaMontaCargaYUnaCargaAlCargaUnaCargaVerificamosLaMontaCargaPermitido() {
		Double peso = 100.0;
		Carga carga = new Carga(peso);
		Double pesoMaximoPermitido = 100.0;
		MontaCarga montaCarga = new MontaCarga(pesoMaximoPermitido);

		montaCarga.cargar(carga);
		Integer valorEsperado = 1;
		Integer cantidadDeCarga = montaCarga.obetenerCantidadDeCargas();
		assertEquals(valorEsperado, cantidadDeCarga);
	}

	@Test
	public void dadoQueExisteUnMontaCargaYUnaCargaCuandoSuboLaCargaALmismoVerificarElpesoCargado() {

		Double peso = 100.0;
		Carga carga = new Carga(peso);
		Carga carga2 = new Carga(200.0);
		Double pesoMaximoPermitido = 1000.0;
		MontaCarga montaCarga = new MontaCarga(pesoMaximoPermitido);

		montaCarga.cargar(carga);

		montaCarga.cargar(carga2);
		Double valorEsperado = 300.0;
		Double valorObtenido = montaCarga.obtenerPesoCargado();
		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void dadoQueExisteUnMontaCargaConVariasCargasAlvaciarlObtengoCOmoPesoCargadoIgualACero() {

		Double peso = 100.0;
		Carga carga = new Carga(peso);
		Carga carga2 = new Carga(200.0);
		Double pesoMaximoPermitido = 1000.0;
		MontaCarga montaCarga = new MontaCarga(pesoMaximoPermitido);

		montaCarga.cargar(carga);
		montaCarga.cargar(carga2);

		montaCarga.vaciar();

		Double valorEsperado = 0.0;
		Double valorObtenido = montaCarga.obtenerPesoCargado();
		assertEquals(valorEsperado, valorObtenido);

		Integer valorEsperado2 = 0;

		Integer valorObtenido2 = montaCarga.obtenerCantidadDeCargas();
		assertEquals(valorEsperado2, valorObtenido2);

	}
}
