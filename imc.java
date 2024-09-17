
public class imc {
    private Double altura;
    private Double peso;
    private Double valor;
    private String resultado;

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void calcularIMC() {
        if (altura != null && peso != null && altura > 0) {
            this.valor = peso / (altura * altura);
            if (valor < 18.5) {
                resultado = "Abaixo do peso";
            } else if (valor < 24.9) {
                resultado = "Peso normal";
            } else if (valor < 29.9) {
                resultado = "Sobrepeso";
            } else {
                resultado = "Obesidade";
            }
        } else {
            resultado = "Altura ou peso inválido";
        }
    }
}


