package test.br.com.alisson.tdd.service;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR{
        @Override
        public BigDecimal PercentualReajuste() {
            return new BigDecimal("0.03");
        }
    },
    BOM {
        @Override
        public BigDecimal PercentualReajuste() {
            return new BigDecimal("0.15");
        }
    },
    OTIMO {
        @Override
        public BigDecimal PercentualReajuste() {
            return new BigDecimal("0.2");
        }
    };

    public abstract BigDecimal PercentualReajuste();
}
