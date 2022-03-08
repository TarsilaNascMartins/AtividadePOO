package herança

class cachorro(idade: Int, nome: String):animal(idade, nome) {
    override fun som(): String {
        return "Latindo como cachorro."
    }

    override fun comer(): String {
        return "O cachorro come ração."
    }

    fun correr (): String{
      return "Correndo como um cachorro."
    }

    fun mostrardado (){

        println("O nome do animal é $nome e a idade é $idade anos.")
    }

    override fun toString(): String {
        return "Status: ${correr()}" +
                "\nSom que faz: ${som()}" +
                "\nO que come: ${comer()}"
    }
}
