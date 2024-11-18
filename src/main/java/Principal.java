import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(String[] args) {
        // Criando uma cidade imutável (CidadeRecord)
        // Como é um record, o nome da cidade não pode ser alterado depois de definido.
        CidadeRecord cidade1 = new CidadeRecord("São Paulo");
        System.out.println("CidadeRecord: " + cidade1.nome());

        // Criando uma cidade mutável (Cidade)
        // Aqui, podemos alterar o nome da cidade usando o setter.
        Cidade cidade2 = new Cidade("Rio de Janeiro");
        System.out.println("Cidade antes da mudança: " + cidade2.getNome());
        cidade2.setNome("Brasília"); // Mudamos o nome da cidade para "Brasília"
        System.out.println("Cidade após a mudança: " + cidade2.getNome());

        // Criando uma pessoa com cidade mutável (PessoaRecordShallow)
        // A pessoa não pode ter seus campos alterados, mas a cidade ainda pode ser modificada,
        // pois ela é mutável. Isso mostra a imutabilidade superficial.
        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("Carlos", cidade2);
        System.out.println("PessoaRecordShallow: " + pessoaShallow.nome() + " - " + pessoaShallow.cidade().getNome());

        // Criando uma pessoa com cidade imutável (PessoaRecord)
        // Tanto a pessoa quanto a cidade são imutáveis, o que significa que nada pode ser alterado
        // depois de criado, garantindo total imutabilidade.
        PessoaRecord pessoa = new PessoaRecord("Ana", cidade1);
        System.out.println("PessoaRecord: " + pessoa.nome() + " - " + pessoa.cidade().nome());
    }
}

