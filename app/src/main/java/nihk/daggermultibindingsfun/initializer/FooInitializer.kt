package nihk.daggermultibindingsfun.initializer

import android.content.Context
import nihk.daggermultibindingsfun.Foo
import javax.inject.Inject

class FooInitializer @Inject constructor(
    private val context: Context
) : Initializer {

    override fun initialize() {
        Foo.initialize(context)
    }
}