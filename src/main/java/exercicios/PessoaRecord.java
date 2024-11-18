package exercicios;

// Classe que representa uma pessoa com a cidade associada.
// Aqui, tanto a pessoa quanto a cidade são imutáveis, pois o campo 'cidade' é um record (CidadeRecord),
// tornando o objeto 'PessoaRecord' profundamente imutável.
// (deep immutable)
public record PessoaRecord(String nome, CidadeRecord cidade) { }

