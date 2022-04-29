package test.br.com.alisson.tdd.service;

import br.com.alisson.tdd.modelo.Funcionario;
import br.com.alisson.tdd.service.BonusService;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

/**
 * BonusService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>abr 29, 2022</pre>
 */
public class BonusServiceTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: calcularBonus(Funcionario funcionario)
     */
    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() throws Exception {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Alisson", LocalDate.now(), new BigDecimal("25000")));
        assertEquals(new BigDecimal("0.00"), bonus);
    }
    @Test
    public void bonusDeveriaSer10PorCentoDoSalario() throws Exception {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Alisson", LocalDate.now(), new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.00"), bonus);
    }
    @Test
    public void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() throws Exception {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Alisson", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"), bonus);
    }


} 
