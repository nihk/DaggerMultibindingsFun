package nihk.daggermultibindingsfun.initializer

import nihk.daggermultibindingsfun.BuildConfig
import timber.log.Timber
import javax.inject.Inject

class TimberInitializer @Inject constructor() : Initializer {

    override fun initialize() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}