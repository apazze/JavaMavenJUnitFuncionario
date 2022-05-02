package test.br.com.alisson.tdd.service;

import br.com.alisson.tdd.modelo.Desempenho;
import br.com.alisson.tdd.modelo.Funcionario;
import br.com.alisson.tdd.service.ReajusteService;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;
    @BeforeEach
    public void Inicializar(){
        this.service = new ReajusteService();
        this.funcionario = new Funcionario(null, LocalDate.now(), new BigDecimal("1000.00"));
    }
    @AfterEach
    public void Finalizar(){
        System.out.println("Fim do teste");
    }
    @BeforeAll
    public static void antesDeTodos(){
        System.out.println("Antes de todos");
    }
    @AfterAll
    public static void depoisDeTodos(){
        System.out.println("Depois de todos");
    }

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        service.ConcederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerDeDezPorCentoQuandoDesempenhoForBom() {
        service.ConcederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
        service.ConcederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
