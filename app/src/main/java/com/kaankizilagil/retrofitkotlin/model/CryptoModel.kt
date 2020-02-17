package com.kaankizilagil.retrofitkotlin.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(

    //@SerializedName("currency")
    val currency: String,

    //@SerializedName("price")
    val price: String
)

// ********* If you create a data class from normal class, you must create constructions *********
