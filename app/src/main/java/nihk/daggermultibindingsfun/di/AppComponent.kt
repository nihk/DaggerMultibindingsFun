package nihk.daggermultibindingsfun.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import nihk.daggermultibindingsfun.initializer.AppInitializers

@Component(modules = [InitializerModule::class])
interface AppComponent {

    fun appInitializers(): AppInitializers

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}