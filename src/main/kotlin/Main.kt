fun main() {
   /*
   2 )Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
   em seguida crie um objeto avião, defina as instancias deste objeto e apresente as
   informações deste objeto no console.
   */
 /*
   val linhaTam = avião()

    linhaTam.numPiloto = 2
    linhaTam.numCoPiloto = 3
    linhaTam.aeromoce = 6
    linhaTam.classe = "economica"
    linhaTam.passageiro = 100

    println("O motor está desligado ou ligado?\n Digite 1- para ligar e 2- para manter desligado")
    val resposta33 = readLine()!!.toInt()

    println("Vamos decolar? Digite a velocidade para começar a decolar.")
    val velocidadeDecolar = readLine()!!.toDouble()

    linhaTam.motorOnoff(resposta33)
    linhaTam.DecolaAterrissa(resposta33, velocidadeDecolar)


        println("Deseja ver as informações do seu voo? sim/não")
          val info = readLine()!!.toString()

           if (info == "SIM" || info == "sim"){
            linhaTam.mostrarInformacoesVoo()
            println("Obrigada pela escolha da nossa companhia aerea.")
           } else {
             println("Ok! Tenha uma boa viagem.")
            }



  */


    /*
    3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto produto eletrônico, defina as instancias deste
     objeto e apresente as informações deste objeto no console.
     */

/*
     val info = eletronico (500.0, "celular", 10)

    println("***LOJINHA PARA ENCOMENDAR CELULARES***")

    println("Digite o produto desejado")
    val valor2 = readLine()!!

    println("Digite a versão desejada do produto:")
    val valor4 = readLine()!!

    println("Digite a quantidade do produto")
    val valor = readLine()!!.toInt()

    println("Digite o/os acessórios que deseja adicionar:")
    val valor3 = readLine()!!


    println("Por favor confirme sua encomenda:")

    info.produto(valor2)
    info.versao(valor4)
    info.quantidadeProduto(valor)
    info.qualAcessorio(valor3)

    print("O peso do produto é: ${info.pesoProduto}g \n")

    print("O tempo de bateria do produto é de: ${info.tempoBateria}mAh \n")

    print("O tipo de produto é: ${info.tipoP} \n")

   // Descrição por data class (somente com constructor primário)
   //  print("Especificações fixas do ")
   //  print(info)


      println("*** Teste do seu aparelho $valor2 versão $valor4 *** ")

        print("Digite o valor da bateria:")
        val bat = readLine()!!.toInt()

                info.totalBateria(bat)


    println("Você recebeu uma ligação, deseja atender?")
    val lig = readLine()!!.toString()

    if (lig == "SIM" || lig == "sim") {
        info.recebeLig(bat)
    } else {
        println ("A ligação foi recusada.")
    }



 */

/*
  4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
  em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as
  informações deste objeto no console.
 */


    //salarioTotal = (salario - (valorDia * diasAusentes)) + comissão


    val trab = funcionario ( "Celulares do Seu Zé")

    println("***SALÁRIO TRABALHADOR ${trab.empresa}***")

    println("Digite o nome do funcionário:")
    val nomeTrabalhador = readLine()!!

    println("Digite o código de cadastro do funcionário:")
    val codigoTrabalhador = readLine()!!.toInt()


    //Calcular comissão

    println("Vamos calcular a comissão, seu gerente digitará de 1 à 4 \n para ver o quanto" +
            "de comissão você ganhará, cada item é um ponto." +
            "\n - Revisou os códigos" +
            "\n - Realizou as reuniões diárias e ajudou nos feedbacks" +
            "\n - Entregou todos os projetos da semana" +
            "\n - Realizou os pprojetos no tempo estipulado pela sprint")

      val pontos = readLine()!!.toInt()

    trab.valorComissao(pontos, 100)


    println("Digite o seu salário fixo:")
    val salario = readLine()!!.toDouble()

    println("Digite o valor do dia trabalhado:")
    val valorDia = readLine()!!.toDouble()

    println("Digite os dias ausentes:")
    val diasAusentes = readLine()!!.toInt()

    trab.nomeTrab (nomeTrabalhador, codigoTrabalhador)
    trab.salarioTotal(salario, valorDia, diasAusentes, pontos, 100)









}