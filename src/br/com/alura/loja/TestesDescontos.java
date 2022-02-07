package br.com.alura.loja;

import java.math.BigDecimal;

import desconto.CalculadoraDeDescontos;
import imposto.CalculadoraDeImpostos;
import orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento));
	}
}
