package herança

class preguica (idade: Int, nome: String): animal(idade, nome) {

    override fun som(): String {
              return  "Fazendo som de preguiça."
    }

    override fun comer() : String {
            return "A preguiça come folhas e frutos."
    }

    fun subindo (): String{
        return "Subindo na árvore como uma preguiça."
    }

    override fun toString(): String {
        return    "Status : ${subindo()}" +
                "\nSom que faz: ${som()}" +
                "\nO que come: ${comer()}"
    }

    fun mostrardado (){

        println("O nome do animal é $nome e a idade é $idade anos.")
    }




}