fun main(){

/*
Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos
mais duas opções de construtores conforme sua percepção, com os atributos: nome (String), endereço
 (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
 Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco
 try catch.
 */

    mutableListOf<cliente>()
    val sub = cliente("João", "Rua Caetano 56 ","678999292")
     val opc = 1

    while (opc in 1..3) {

        try {
        do {
            println(
                "Digite um NÚMERO para corresponder a uma função na lista de compras:" +
                        "\n 1- Adicionar item /  2- Remover item / 3- Listar os itens"
            )

            val opc = readLine()!!.toInt()

            //painel
            when (opc) {

                //Adicionar item
                1 -> {
                    println("Digite um item para adicionar a lista")
                    val add = readLine()!!.toString()
                    sub.adicionarItem(add)
                }

                // Remover item
                2 -> {
                    println("Digite um item para remover da lista")
                    val rem = readLine()!!.toString()
                    sub.removerItem(rem)
                }

                // Listar
                3 -> {
                    println(sub.listar())
                }
            }


            //Resposta para o Loop
            println(
                "Deseja continuar?" +
                        "\n 1- Sim" +
                        "\n 2- Não"
            )
            val resposta = readLine()!!.toInt()

        } while (resposta == 1)


        //Try catch para não quebrar programa
            val opc = readLine()!!.toInt()
            break
        }catch (e: Exception) {
            println(e.message)

        }
    }

}