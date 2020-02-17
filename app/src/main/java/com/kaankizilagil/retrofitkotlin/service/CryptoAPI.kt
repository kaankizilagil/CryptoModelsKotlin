package com.kaankizilagil.retrofitkotlin.service

import com.kaankizilagil.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    // GET, POST, UPDATE, DELETE

    @GET("prices?key=b5d264934ddc26442cf828e1c7fc6c27")

    fun getData(): Observable<List<CryptoModel>>

    //fun getData(): Call<List<CryptoModel>>
}
