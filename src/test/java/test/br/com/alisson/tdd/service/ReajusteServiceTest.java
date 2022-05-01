package test.br.com.alisson.tdd.service;

import br.com.alisson.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ReajusteServiceTest {
    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario(null, LocalDate.now(), new BigDecimal("1000.00"));
        service.ConcederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerDeDezPorCentoQuandoDesempenhoForBom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario(null, LocalDate.now(), new BigDecimal("1000.00"));
        service.ConcederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario(null, LocalDate.now(), new BigDecimal("1000.00"));
        service.ConcederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
