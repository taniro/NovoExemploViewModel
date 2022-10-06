package tads.eaj.ufrn.novoexemploviewmodel

import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import com.bumptech.glide.Glide

@BindingAdapter("converteIdade")
fun converteIdadeEstimadaEmTexto(textview: TextView?, carro: LiveData<Carro>){
    if (textview != null){
        textview.text = carro.value?.estimativaDeIdade().toString()
    }
}

@BindingAdapter("loadImage")
fun loadImage(imageView: ImageView, url:String){

    Log.i("AULA", "Binding Adapter foi invocado")
    Glide.with(imageView.context)
         .load(url)
         .into(imageView)
}
