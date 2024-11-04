package Principal;

import java.math.BigDecimal;


public class Vendedor extends Funcionario {
    public Vendedor(int id, BigDecimal salario, int codigoDepartamento) {
        super(id, salario, "Vendedor", codigoDepartamento);
    }
}

