package com.smk.futbol.data.source.remote.response

import com.smk.futbol.model.Team

data class TeamResponse (
    val teams: MutableList<Team>
)