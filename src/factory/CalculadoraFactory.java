package factory;
import enums.TipoCalculadora;
import interfaces.Calculadora;
import services.CalculadoraBonus;
import services.CalculadoraSalario;
import services.calculadoraextra;

public class CalculadoraFactory {

    public static Calculadora getCalculadora(TipoCalculadora tipo) {
        return switch (tipo) {
            case SALARIO -> new CalculadoraSalario();
            case EXTRA -> new calculadoraextra();
            case BONUS -> new CalculadoraBonus();
        };
    }
}