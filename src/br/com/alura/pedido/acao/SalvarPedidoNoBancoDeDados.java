package br.com.alura.pedido.acao;

import br.com.alura.loja.pedido.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {



	@Override
	public void executarAcao(Pedido pedido) {
		// TODO Auto-generated method stub
		System.out.println("Salvando dados do pedido no banco");
		
	}
}
