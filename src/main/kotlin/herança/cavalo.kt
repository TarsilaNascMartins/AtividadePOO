package herança

class cavalo(idade: Int, nome: String) : animal(idade, nome) {

    override fun som(): String {
       return " Relinchando como um cavalo"
    }

    override fun comer(): String {
        return "O cavalo come feno e palha."
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