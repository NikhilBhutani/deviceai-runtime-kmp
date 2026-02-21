package com.nikhilbhutani.demo.di

import com.nikhilbhutani.demo.AudioRecorder
import com.nikhilbhutani.demo.SpeechViewModel
import org.koin.dsl.module

val appModule = module {
    single { AudioRecorder() }
    single { SpeechViewModel(get()) }
}
