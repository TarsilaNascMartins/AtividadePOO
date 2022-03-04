class avião {


    var numPiloto = 0
    var numCoPiloto = 0
    var aeromoce = 0
    var classe = ""
    var passageiro = 0


            fun mostrarPassageiros ( ) {

                println("O número de passageiros da classe $classe é de $passageiro pessoas")

            }

            fun mostrarFuncionarios() {
                println("Os funcionários destes avião, incluem:")
                println("Aeromoça (o) = $aeromoce")
                println("Copilota (o) = $numCoPiloto")
                println("Pilota (o) = $numPiloto")
            }


}