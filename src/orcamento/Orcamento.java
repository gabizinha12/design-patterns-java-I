package orcamento;

import java.math.BigDecimal;

import br.com.alura.DomainException;
import orcamento.situacao.EmAnalise;
import orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	public void aprovar(Orcamento orcamento) throws DomainException {
		this.situacao.aprovar(orcamento);
	}

	public void reprovar(Orcamento orcamento) throws DomainException {
		this.situacao.reprovar(orcamento);
	}
	public void finalizar(Orcamento orcamento) throws DomainException {
		this.situacao.finalizar(orcamento);
	}

}
