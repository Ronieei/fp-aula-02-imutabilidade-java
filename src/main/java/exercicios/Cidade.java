package exercicios;

// Classe para representar uma cidade mutável, utilizando uma classe tradicional.
// Aqui, podemos alterar o nome da cidade a qualquer momento, já que temos getters e setters.
// (mutable)
public class Cidade {
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

