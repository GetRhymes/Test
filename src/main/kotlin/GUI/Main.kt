package GUI

import javafx.stage.Stage
import tornadofx.App

class Main: App(Start::class) {
    override val primaryView = Start::class


    override fun start(stage: Stage) {
        stage.isResizable = false
        super.start(stage)
    }

}