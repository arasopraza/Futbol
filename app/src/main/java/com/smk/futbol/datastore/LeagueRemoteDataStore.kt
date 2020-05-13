package com.smk.futbol.datastore

import com.smk.futbol.model.League
import com.smk.futbol.network.ApiService

class LeagueRemoteDataStore(private val apiService: ApiService) :
    LeagueDataStore {
    override suspend fun getDetailLeague(): MutableList<League>? {
        val response = apiService.getDetailLeague()
        if (response.isSuccessful) return response.body()?.leagues

        throw Exception("Terjadi kesalahan ${response.code()}")
    }

    override suspend fun addAll(leagues: MutableList<League>) {
    }

}