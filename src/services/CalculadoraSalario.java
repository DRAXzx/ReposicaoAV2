package services;
import exceptions.FuncionarioInativoException;
import exceptions.HorasTrabalhadasInvalidasException;
import exceptions.ValorHoraInvalidoException;
import interfaces.Calculadora;
import models.Funcionario;

public class CalculadoraSalario implements Calculadora {
    @Override
    public double calcular(Funcionario f) throws Exception {
        if (!f.isAtivo()) {
            throw new FuncionarioInativoException("Funcionário inativo. Não é possível calcular o salário.");
        }
        if (f.getHorasTrabalhadas() <= 0) {
            throw new HorasTrabalhadasInvalidasException("Horas trabalhadas devem ser maiores que zero.");
        }
        if (f.getValorHora() <= 0) {
            throw new ValorHoraInvalidoException("Valor por hora deve ser maior que zero.");
        }
        return f.getValorHora() * f.getHorasTrabalhadas();
    }
}