package decorator;

public class Multimidia extends CarroDecorator {
    public Multimidia(Carro carro) {
        super(carro);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Multimidea";
    }
}
