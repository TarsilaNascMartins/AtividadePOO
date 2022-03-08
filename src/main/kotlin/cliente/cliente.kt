data class cliente (private var nome: String) {

    private var endereco = ""
    private var telefone = ""
    private var listaDeCompra = mutableListOf<String>()

    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String)
            : this(nome, endereco) {
        this.telefone = telefone
    }

    init {
        if (nome.isEmpty()) {
            throw Exception("Não há nome do usuário na lista de compras")
        } else {
            println("Olha só, temos um nome!")
        }}



        fun adicionarItem(valor: String) {
            if (valor.isEmpty()) {
                println("Este item é inválido.")
            } else {
                listaDeCompra.add(valor)
                println("Item adicionado com sucesso.")
            }
        }


        fun removerItem(valor: String) {
            if (valor.isEmpty()) {
                println("Este item é inválido.")
            } else if (listaDeCompra.contains(valor)) {
                listaDeCompra.remove(valor)
                println("Item removido com sucesso.")
            }else {
                println("O item não existe na lista, logo não pode ser removido.")
            }


        }


        // Listar Itens

        fun listar() {
            listaDeCompra.forEach() {
                println(it)
            }
        }

        override fun toString(): String {
            return "Nome: $nome" +
                    "\nEndereco: $endereco" +
                    "\nTelefone: $telefone\n\n"
        }


    }



