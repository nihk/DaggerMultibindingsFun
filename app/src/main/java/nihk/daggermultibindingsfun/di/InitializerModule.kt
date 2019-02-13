package nihk.daggermultibindingsfun.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet
import nihk.daggermultibindingsfun.initializer.FooInitializer
import nihk.daggermultibindingsfun.initializer.Initializer
import nihk.daggermultibindingsfun.initializer.TimberInitializer

@Module
abstract class InitializerModule {

    @Binds
    @IntoSet
    abstract fun timberInitialize(timberInitializer: TimberInitializer): Initializer

    @Binds
    @IntoSet
    abstract fun fooInitializer(fooInitializer: FooInitializer): Initializer
}