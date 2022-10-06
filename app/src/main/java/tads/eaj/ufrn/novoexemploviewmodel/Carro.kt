package tads.eaj.ufrn.novoexemploviewmodel

class Carro (var kmRodados:Int, var modelo:String, var cor:String, var url:String) {

    fun rodarKms(){
        this.kmRodados = this.kmRodados + 1
    }

    fun funilaria(novaCor:String){
        this.cor = novaCor
    }

    fun estimativaDeIdade():Int{
        return kmRodados/10000
    }
}