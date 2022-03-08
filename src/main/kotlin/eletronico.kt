data class eletronico constructor ( var pesoProduto : Double, var tipoP : String, var tempoBateria : Int  )
{
    var quantidade = 0
    var produto = " " // ex: tablet, celular, etc.
    var acessorio = " " //ex: capinha, fones
    var versao = ""


    fun quantidadeProduto (valor: Int){
        println("A quantidade escolhida é de: $valor unidade(s)")
    }

    fun produto (valor: String){
            println("O produto escolhido foi: $valor")
    }

    fun qualAcessorio (valor: String){
        println("O acessório escolhido foi/foram: $valor")
    }

    fun versao (valor: String){
        println("A versão do produto escolhida é : $valor")
    }




        fun totalBateria(valor : Int){
            if (valor <= 5 ) {
                println("Você tem menos de 5% de bateria. Provavelmente perca algumas funções :( ")
            } else if (valor > 5) {
                println("Sua bateria está com todas as funções operando normalmente.")
            }
        }

        fun recebeLig (valor : Int) {

            if (valor <= 5) {
                println("Realmente você tem pouca bateria. Não poderá receber ligações neste instante.")
            } else if (valor > 5) {
                println ("Você tem uma ligação...")
            }


        }


}