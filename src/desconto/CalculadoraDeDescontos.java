package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaMaisDeCincoItens(
				new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto()));
		return desconto.efetuarCalculo(orcamento);
	}
}
