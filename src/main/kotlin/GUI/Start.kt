package GUI

import javafx.geometry.Pos
import tornadofx.*

class Start : View("My View") {
    override val root = borderpane {
        center {
            setPrefSize(400.0, 200.0)
            vbox {
                translateX = 100.0
                translateY = 20.0
                label ("Философия") {
                    setPrefSize(200.0, 40.0)
                    alignment = Pos.CENTER
                    style {
                        fontSize = 30.px
                    }
                }

                button("Старт") {
                    translateY = 20.0
                    setPrefSize(200.0, 30.0)
                    action {
                        close()
                        find<Test>().openWindow()
                    }
                }
            }
        }
    }
}
