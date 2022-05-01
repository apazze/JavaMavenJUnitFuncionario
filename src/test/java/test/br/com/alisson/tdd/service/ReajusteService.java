package test.br.com.alisson.tdd.service;

import br.com.alisson.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void ConcederReajuste(Funcionario funcionario, Desempenho desempenho) {
        //Usado design pattern Strategy - método abstrato PercentualReajuste em Desempenho
        BigDecimal percentual = desempenho.PercentualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.ReajustarSalario(reajuste);
    }
}
