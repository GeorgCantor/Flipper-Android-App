package com.flipper.app.home.di

import com.flipper.app.home.HomePresenter
import dagger.Component

@HomeScreenScope
@Component(
    modules = [HomeScreenModule::class],
    dependencies = [HomeScreenDependencies::class]
)
interface HomeScreenComponent {
    fun presenter(): HomePresenter
}
