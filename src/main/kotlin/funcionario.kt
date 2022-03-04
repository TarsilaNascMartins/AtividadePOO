class funcionario ( val comissão : Double, val empresa : String){

    val nomeTrabalhador = ""
    val codigoTrabalhador = 0


    var salarioTotal = 0.0

    fun nomeTrab (valor:String, valor2: Int){
        println("O funcionário: $valor com o código $valor2, " +
                "terá o seguinte salário:")
    }


    fun salarioTotal (valor : Double, valor2 : Double, valor3 : Int){

        //salarioTotal = (salario - (valorDia * diasAusentes)) + comissão

       salarioTotal = (valor - (valor2 * valor3)) + comissão

        println(" --> O seu salário é de $salarioTotal, sendo que foram $valor3 dias não trabalhados." +
                "E sua comissão mensal é de $comissão")


    }





}