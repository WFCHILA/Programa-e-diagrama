package Principal;

import java.math.BigDecimal;
import java.util.*;

public class Bonus {
    public static void main(String[] args) {
        // Lista de funcionários
        List<Funcionario> funcionarios = Arrays.asList(
            new Vendedor(1, new BigDecimal("170000"), 1),
            new Gerente(2, new BigDecimal("120000"), 1),
            new Vendedor(3, new BigDecimal("160000"), 2)
        );

        // Lista de departamentos
        List<Departamento> departamentos = Arrays.asList(
            new Departamento(1, new BigDecimal("500000")),
            new Departamento(2, new BigDecimal("600000"))
        );
        
        // Aplicando bônus
        int resultado = ControleBonus.aplicarBonus(funcionarios, departamentos);
        
        // Exibindo o resultado da aplicação de bônus
        if (resultado == 0) {
            System.out.println("Conseguiu o bonus, isso ai!!!");
        } else if (resultado == 1) {
            System.out.println("Erro: Uma ou mais tabelas estão vazias.");
        } else if (resultado == 2) {
            System.out.println("Erro: Nenhum funcionário elegível.");
        }

        // Exibindo salários atualizados dos funcionários
        for (Funcionario func : funcionarios) {
            System.out.println("Funcionario ID: " + func.getId() + ", Novo Salario: " + func.getSalario());
        }
    }
}
