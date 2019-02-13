package nihk.daggermultibindingsfun

import android.app.Application
import nihk.daggermultibindingsfun.di.AppComponent
import nihk.daggermultibindingsfun.di.DaggerAppComponent

class App : Application() {

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .context(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.appInitializer().initialize()
    }
}