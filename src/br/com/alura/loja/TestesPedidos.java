package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.pedido.acao.EnviarEmailPedido;
import br.com.alura.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "teste";
		BigDecimal valorOrcamento = new BigDecimal("200");
		int quantidadeItens = Integer.parseInt("2");
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler  handler = new GeraPedidoHandler(
				Arrays.asList(
						new SalvarPedidoNoBancoDeDados(), 
						new EnviarEmailPedido()));
		handler.execute(gerador);

	}

}
