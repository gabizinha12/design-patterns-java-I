package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import orcamento.Orcamento;

public class GeraPedidoHandler {

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		super();
		this.acoes = acoes;
	}

	// construtor com injeçao de dependencias: repository, service, etc
	private List<AcaoAposGerarPedido> acoes; 
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		LocalDateTime data = LocalDateTime.now();
		Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);
		acoes.forEach(a -> a.executarAcao(pedido));
		
	
	}
}
