class funcionario ( val empresa : String){

    val nomeTrabalhador = ""
    val codigoTrabalhador = 0

     var salarioTotal = 0.0
    var comissao = 0.0

    fun nomeTrab (valor:String, valor2: Int){
        println("O funcionário: $valor com o código $valor2, " +
                "terá o seguinte salário:")
    }


    fun valorComissao (valor: Int, valor2 : Int) : Int{

        return valor * valor2

    }



    fun salarioTotal (valor : Double, valor2 : Double, valor3 : Int, valor4 : Int, valor5 : Int){

        //salarioTotal = (salario - (valorDia * diasAusentes)) + comissão

       salarioTotal = (valor - (valor2 * valor3)) + (valor4 * valor5)

        println(" --> O seu salário é de $salarioTotal, sendo que foram $valor3 dias não trabalhados." +
                "E sua comissão mensal é de ${valor4 * valor5}")


    }





}