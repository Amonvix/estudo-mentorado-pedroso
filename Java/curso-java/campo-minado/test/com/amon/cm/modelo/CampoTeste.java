package com.amon.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.amon.cm.excecao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo = new Campo(3,3);
	
	
	@BeforeEach
	void inicarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test	
	void testeVizinhoEsquerda() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
		
	}
	@Test	
	void testeVizinhoDireita() {
		Campo vizinho = new Campo(3,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
		
	}
	@Test	
	void testeVizinhoAcima() {
		Campo vizinho = new Campo(2,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
		
	}
	@Test	
	void testeVizinhoAbaixo() {
		Campo vizinho = new Campo(4,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
		
	}
	@Test	
	void testeVizinhoDiagona() {
		Campo vizinho = new Campo(2,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
		
	}
	@Test	
	void testeNaoVizinho() {
		Campo vizinho = new Campo(5,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
		
	}
	
	@Test
	void testeAtributoMarcado() {
		
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarQuadrado() {
		campo.alternarQuadrado();
		assertTrue(campo.isMarcado());
	}
	@Test
	void testeAlternarQuadradoDuasVezes() {
		campo.alternarQuadrado();
		campo.alternarQuadrado();
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeNaoMinadoNaoMarcado() {
		
		assertTrue(campo.abrir());
	}
	@Test
	void testeNaoMinadoMarcado() {
		campo.alternarQuadrado();
		assertFalse(campo.abrir());
	}
	@Test
	void testeMinadoMarcado() {
		campo.alternarQuadrado();
		campo.minar();
		assertFalse(campo.abrir());
	}
	@Test
	void testeMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> {
			
			campo.abrir();
		});
		
	}
	@Test
	void testeAbrirVizinho() {
		Campo campo11 = new Campo(1, 1);
		
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void testeAbrirVizinho2() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		campo12.minar();		
		Campo campo22 = new Campo(2, 2);
		campo11.adicionarVizinho(campo12);
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertFalse(campo22.isAberto() && campo11.isAberto() && campo12.isAberto());
	
	}
}
