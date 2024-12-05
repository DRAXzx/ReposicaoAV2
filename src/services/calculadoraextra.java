package services;
import exceptions.FuncionarioInativoException;
import exceptions.HorasExtrasInvalidasException;
import exceptions.ValorHoraInvalidoException;
import interfaces.Calculadora;
import models.Funcionario;

public class calculadoraextra implements Calculadora {
    @Override
    public double calcular(Funcionario f) throws Exception {
        if (!f.isAtivo()) {
            throw new FuncionarioInativoException("Funcionário inativo. Não é possível calcular o extra.");
        }
        if (f.getHorasExtra() < 0) {
            throw new HorasExtrasInvalidasException("Horas extras não podem ser negativas.");
        }
        if (f.getValorHora() <= 0) {
            throw new ValorHoraInvalidoException("Valor por hora deve ser maior que zero.");
        }
        return f.getValorHora() * f.getHorasExtra();
    }
}

