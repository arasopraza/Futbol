package com.smk.futbol.ui.event

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.savedstate.SavedStateRegistryOwner
import com.smk.futbol.repository.EventRepository
import java.lang.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class EventFactory(
    savedStateRegistryOwner: SavedStateRegistryOwner, defaultArgs: Bundle,
    private val eventRepository: EventRepository
) : AbstractSavedStateViewModelFactory(savedStateRegistryOwner, defaultArgs) {

    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        return EventViewModel(eventRepository) as T

    }
}