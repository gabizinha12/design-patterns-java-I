package orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.DomainException;
import orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Finalizado());
	}

	

}
