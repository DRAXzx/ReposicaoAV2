import enums.TipoCalculadora;
import exceptions.FuncionarioNaoEncontradoException;
import factory.CalculadoraFactory;
import interfaces.Calculadora;
import models.Funcionario;

public class Main {
    public static void main(String[] args) {
        try {
            Funcionario[] funcionarios = {
                    new Funcionario("João", "111.111.111-11", "Rua A", "joao@email.com", true, 50, 160, 20),
                    new Funcionario("Maria", "222.222.222-22", "Rua B", "maria@email.com", true, 60, 180, 30),
                    new Funcionario("Pedro", "333.333.333-33", "Rua C", "pedro@email.com", false, 45, 150, 25),
                    new Funcionario("Ana", "444.444.444-44", "Rua D", "ana@email.com", true, 70, 200, 10),
                    new Funcionario("Carlos", "555.555.555-55", "Rua E", "carlos@email.com", true, -50, 120, 15)
            };

            for (Funcionario f : funcionarios) {
                try {
                    Calculadora salario = CalculadoraFactory.getCalculadora(TipoCalculadora.SALARIO);
                    Calculadora extra = CalculadoraFactory.getCalculadora(TipoCalculadora.EXTRA);
                    Calculadora bonus = CalculadoraFactory.getCalculadora(TipoCalculadora.BONUS);

                    System.out.printf("Funcionário: %s%n", f.getNome());
                    System.out.printf("Salário: %.2f%n", salario.calcular(f));
                    System.out.printf("Extra: %.2f%n", extra.calcular(f));
                    System.out.printf("Bônus: %.2f%n", bonus.calcular(f));
                    System.out.println();
                } catch (Exception e) {
                    System.out.printf("Erro ao processar funcionário %s: %s%n%n", f.getNome(), e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Erro fatal: " + e.getMessage());
        }
    }
}