package nihk.daggermultibindingsfun.initializer

import javax.inject.Inject

class AppInitializers @Inject constructor(
    private val initializers: Set<@JvmSuppressWildcards Initializer>
) : Initializer {

    override fun initialize() {
        initializers.forEach(Initializer::initialize)
    }
}