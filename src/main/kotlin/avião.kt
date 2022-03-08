class avião {

    //decolar e aterrissar

    var numPiloto = 0
    var numCoPiloto = 0
    var aeromoce = 0
    var classe = ""
    var passageiro = 0

    //var velocidade
   /// var acelera
   // var diminui

    var motorOnOff = true

            fun motorOnoff(valor: Int) {

                if (valor == 1) {
                    motorOnOff = true
                    println("O motor está ligado! Vamos voar!")
                } else if (valor == 2 ){
                    motorOnOff = false
                    println("O motor está desligado. Provavelmente algum dos comandos " +
                            "não funcionarão!")
                }

            }


            fun DecolaAterrissa (valor1: Int ,valor: Double){

                if (valor1 == 2){
                    println("O motor está desligado você não pode continuar o voo.")

                } else if (valor1 == 1 && valor > 0.0 ){
                    println("O motor está ligado. Estamos decolando! ")
                } else if (valor1 == 1 && valor <= 0) {
                    println("Este valor é inválido, pois é um valor negativo para a velocidade.")
                }





            }


            fun mostrarInformacoesVoo() {
                println("O número de passageiros da classe $classe é de $passageiro pessoas")
                println("Os funcionários destes avião, incluem:")
                println("Aeromoça (o) = $aeromoce")
                println("Copilota (o) = $numCoPiloto")
                println("Pilota (o) = $numPiloto")
            }


}