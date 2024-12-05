package services;
import exceptions.FuncionarioInativoException;
import interfaces.Calculadora;
import models.Funcionario;

public class CalculadoraBonus implements Calculadora {
    @Override
    public double calcular(Funcionario f) throws Exception {
        if (!f.isAtivo()) {
            throw new FuncionarioInativoException("Funcionário inativo. Não é possível calcular o bônus.");
        }

        int totalHoras = f.getHorasTrabalhadas() + f.getHorasExtra();
        if (totalHoras > 200) {
            return (f.getValorHora() * f.getHorasTrabalhadas()) * 1.15;
        } else {
            return 0;
        }
    }
}
