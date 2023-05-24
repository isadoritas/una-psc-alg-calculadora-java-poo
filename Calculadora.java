public class Calculadora {
    private double numeroUm;
    private double numeroDois;

    public double getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(double numeroUm) {
        this.numeroUm = numeroUm;
    }

    public double getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(double numeroDois) {
        this.numeroDois = numeroDois;
    }

    public double adicao() {
        return numeroUm + numeroDois;
    }

    public double subtracao() {
        return numeroUm - numeroDois;
    }

    public double multiplicacao() {
        return numeroUm * numeroDois;
    }

    public double divisao() {
        return numeroUm / numeroDois;
    }

    public double potencia() {
        return Math.pow(numeroUm, numeroDois);
    }

    public double raizQuadrada() {
        return Math.sqrt(numeroUm);
    }
}

