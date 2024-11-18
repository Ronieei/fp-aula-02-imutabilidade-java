package exercicios;

// Classe que representa uma pessoa com a cidade associada.
// Este record é superficialmente imutável, ou seja, os campos de PessoaRecordShallow não podem ser alterados,
// mas o campo 'cidade' refere-se a um objeto mutável do tipo Cidade, o que permite alterações no objeto Cidade.
// (shallow immutable)
public record PessoaRecordShallow(String nome, Cidade cidade) { }

