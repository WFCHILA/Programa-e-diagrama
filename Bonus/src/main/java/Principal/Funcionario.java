package Principal;

import java.math.BigDecimal;

public class Funcionario {
    private int id;
    private BigDecimal salario;
    private String cargo;
    private int codigoDepartamento;

    // Corrigido: salario como BigDecimal no construtor
    public Funcionario(int id, BigDecimal salario, String cargo, int codigoDepartamento) {
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
        this.codigoDepartamento = codigoDepartamento;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }


    public BigDecimal calcularBonus() {
        BigDecimal salarioLimite = new BigDecimal("150000");
        BigDecimal bonusGerente = new BigDecimal("1000");
        BigDecimal bonusOutro = new BigDecimal("2000");


        if (salario.compareTo(salarioLimite) >= 0 || "Gerente".equalsIgnoreCase(cargo)) {
            return bonusGerente;
        }
        return bonusOutro;
    }
}
