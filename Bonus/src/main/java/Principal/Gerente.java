package Principal;

import java.math.BigDecimal;

public class Gerente extends Funcionario {
    

    public Gerente(int id, BigDecimal salario, int codigoDepartamento) {
        super(id, salario, "Gerente", codigoDepartamento);
    }


    public BigDecimal calcularBonus() {
 
        return new BigDecimal("1000");
    }
}
