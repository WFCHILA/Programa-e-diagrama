package Principal;

import java.math.BigDecimal;
import java.util.List;

public class ControleBonus {
    public static int aplicarBonus(List<Funcionario> funcionarios, List<Departamento> departamentos) {
        // Verifica se as listas de funcionários ou departamentos estão vazias
        if (funcionarios.isEmpty() || departamentos.isEmpty()) {
            return 1; // Erro: Uma ou mais tabelas estão vazias
        }

        boolean funcionarioElegivel = false;

        // Itera sobre os funcionários para aplicar bônus
        for (Funcionario func : funcionarios) {
            BigDecimal bonus = func.calcularBonus();
            
            // Se o funcionário tem bônus (positivo)
            if (bonus.compareTo(BigDecimal.ZERO) > 0) {
                funcionarioElegivel = true;
                // Atualiza o salário do funcionário adicionando o bônus
                func.setSalario(func.getSalario().add(bonus));
            }
        }

        // Verifica se algum funcionário era elegível para o bônus
        if (!funcionarioElegivel) {
            return 2; // Erro: Nenhum funcionário elegível
        }

        return 0; // Bônus aplicado com sucesso
    }
}
