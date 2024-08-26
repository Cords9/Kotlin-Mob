class Pessoa {
    var nome: String

    var idade: Int

    var profissao: String

    constructor(nome: String, idade: Int, profissao: String) {
        this.nome = nome
        this.idade = idade
        this.profissao = profissao
    }

    override fun toString(): String {
        return "Pessoa Registrada Nome $nome Idade $idade  Profissao $profissao "
    }


}