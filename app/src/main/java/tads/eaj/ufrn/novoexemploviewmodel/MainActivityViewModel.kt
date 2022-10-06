package tads.eaj.ufrn.novoexemploviewmodel

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var _carro = MutableLiveData<Carro>()
    var carro:LiveData<Carro> = _carro

    init {
        _carro.value = Carro(20000, "Fusca", "Vermelho", "https://img.olx.com.br/thumbs256x256/63/630206804839186.jpg")
    }

    fun handleClickButtonRodar(){
        _carro.value?.rodarKms()
        _carro.value?.funilaria("Preto")
        _carro.postValue(_carro.value)
    }

    fun handleTextChanged(editable: Editable){
        _carro.value?.modelo = editable.toString()
        _carro.postValue(_carro.value)
    }
}