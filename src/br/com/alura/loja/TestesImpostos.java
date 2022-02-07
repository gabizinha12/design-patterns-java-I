package br.com.alura.loja;

import java.math.BigDecimal;

import imposto.CalculadoraDeImpostos;
import imposto.ISS;
import orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 0);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ISS()));
	}

}
