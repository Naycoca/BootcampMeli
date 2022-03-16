package IMC;

public class Pessoa extends Main {

    private String nome;
    private int idade;
    private int id;
    private double peso;
    private double altura;


    public Pessoa() {

    }

    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, int id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularImc() {
        double imc = this.peso / (Math.pow(this.altura, 2));
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade() {
        if (idade >= 18) return true;
        return false;
    }

    public String toString() {
        String texto = "";

        if (calcularImc() == 0) {
            texto = texto.concat("Seu peso é saudável.\n");
        } else if (calcularImc() == -1) {
            texto = texto.concat("Você está abaixo do peso, talvez seja interessante dedicar atenção a isso.\n");
        } else {
            texto = texto.concat("Você está acima do peso. Talvez seja interessante dar atenção a isso.\n");
        }
        if (ehMaiorIdade() == true) {
            texto = texto.concat("Maior de idade\n");
        } else {
            texto = texto.concat("Menor de idade\n");
        }

        texto = texto.concat(String.format("Nome: %s\n Idade: %d\n Peso: %f\n Altura: %f\n RG: %d\n", nome,idade,peso, altura, id));
        return texto;


    }
}

