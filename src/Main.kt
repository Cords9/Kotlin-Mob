import kotlin.random.Random

fun main() {

    var par :Int = 0

    var impar :Int = 0

    var numeroInteiro = List(10){ Random.nextInt(1,50) }


    for (i in numeroInteiro){
        if (i % 2 ==0) {
            par +=1
        }else{
            impar += 1
        }
    }

    println(numeroInteiro)

    println("temos "+ par +" Numeros pares ")
    println("temos "+ impar +" Numeros impares ")


    var dadoViciado =  Random.nextInt(1,6)

    println("Arremessei um dado caiu em "+ dadoViciado)

   val pessoa1 = Pessoa("Klayver",24,"Analista")
   val pessoa2 = Pessoa("Samuel",25,"Engenheiro")
   val pessoa3 = Pessoa("Thiago",27,"Desenvolvedor")



}


