package GUI

import javafx.geometry.Pos
import javafx.scene.control.Label
import javafx.scene.control.RadioButton
import javafx.scene.control.TextArea
import javafx.scene.control.ToggleGroup
import tornadofx.*
import kotlin.random.Random

class Test : Fragment("My View") {
    override val root = borderpane {


        val listTasks = mutableListOf(
            "1.Понятие диалектический материализм было введено в рамках учения",
            "2.Аксиология",
            "3.Гилозоизм",
            "4.Высказывание о том что душа до рождения человека пребывает в мире идей поэтому в процессе познания она способна припомнить их",
            "5.Кто считается хронологически первым философом античности",
            "6.Кто автор я знаю я ничего не знаю",
            "7.Французский философ создатель рационалистического метода",
            "8.В философии иммануила канта понятие вещи в себе обозначает",
            "9. Представитель немецкой классической философии:",
            "10.Поступай так чтобы максима твоей воли могла в то же время стать и принципом всеобщего законодательства",
            "11.Понятие воли к власти",
            "12.В структуре психики фрейд выделяет",
            "13.Логический вывод частных следствий из общего положения",
            "14.Эпоха в которой мышление было ориентировано на постижение проявлений божественного",
            "15.Согласно Гегелю истинный двигатель истории",
            "16.Представитель объективного идеализма",
            "17.Не является историческим типом мировоззрения",
            "18.Методологический принцип, признающий разум основой познания",
            "19.Онтология учение о",
            "20.Материализм",
            //"21. Представители Материализма (2 ответа)",
            "22. Гносеология",
            "23. Кто из древнегреческих философов пропагандировал идею самопознания “Познай самого себя”",
            "24. Создатель формальной логики",
            "25. Представитель диалектической традиции в философии",
            "26. Представитель атомизма",
            "27. Характерной чертой средневековой философии является",
            "28. Мыслители эпохи средневековья",
            "29. Номинализм это",
            "30. Пантеизм это фк об отождествлении"
        )

        val listAnswer = mutableListOf(
            listOf("Позитивизм", "Структурализм", "Марксизм", "Иррационализм"),
            listOf("Учение о конечной судьбе мира и человека", "Учение о ценностях", "Учение о загробном воздаянии", "Учение о происхождении богов"),
            listOf("Философская концепция о всеобщей причинности", "ФК о всеобщем прощении", "ФК об относительности", "ФК о всеобщей одушевленности"),
            listOf("Демокрит", "Сократ", "Диоген", "Платон"),
            listOf("Платон", "Фалес", "Салон", "Аристотель"),
            listOf("Фалес", "Платон", "Сократ", "Диоген"),
            listOf("Бэкон", "Гоббс", "Декарт", "Лейбниц"),
            listOf("Неизвестная первопричина мироздания", "Синоним понятия бог", "То что вызывает ощущения но само не может быть познано", "То что присутствует в сознании но не осознается"),
            listOf("Рассел", "Зиммель", "Шпенглер", "Фейербах"),
            listOf("Гегель", "Кант", "Ницше", "Маркс"),
            listOf("Маркс", "Ницше", "Спиноза", "Фейрбах"),
            listOf("Оно-до я-пра я", "Оно-сверхя-я", "Оно-сознательное я-не я", "Сознательное-коллективное бессознательное-архетипы"),
            listOf("Дедукция", "Аналогия", "Индукция", "Абстрагирование"),
            listOf("Возрождения", "Античность", "Средневековье", "Новое время"),
            listOf("Воля выдающихся людей", "Мировой дух", "Классовая борьба", "Естественный отбор"),
            listOf("Маркс", "Беркли", "Демокрит", "Гегель"),
            listOf("Миф", "Мораль", "Наука", "Философия"),
            listOf("Сенсуализм", "Скептицизм", "Рационализм", "Релятивизм"),
            listOf("Бытии", "Познании", "Ценностях", "Нравственности"),
            listOf("Признание того что весь мир состоит из одинаковых частиц",
                    "Практически здравый взгляд на вещи",
                    "Признание первичности природы материи и вторичности (зависимости) сознания",
                    "Признание самостоятельного от божественного существования мира"),
          //  listOf("Демокрит", "Гегель", "Платон", "Маркс"),
            listOf("Учение о бытии", "Учение о законах и формах правильного познания", "Учение о ценностях", "Учение о познании"),
            listOf("Фалес", "Гераклит", "Сократ", "Аристотель"),
            listOf("Сократ", "Платон", "Аристотель", "Эпикур"),
            listOf("Фалес", "Гераклит",  "Демокрит", "Эпикур"),
            listOf("Аристотель", "Гераклит", "Демокрит", "Платон"),
            listOf("космоцентризм", "теоцентризм", "гуманизм", "антиклерикализм"),
            listOf("Платон", "Фома Аквинский", "Гераклит", "Дэвид Юм"),
            listOf("утверждает, что реальным самостоятельным существованием обладают лишь единичные вещи а понятие общее всего лишь и имя",
                    "утверждает принцип гармонии веры и разума",
                    "отрицает возможность познания внешнего мира",
                    "рассматривает вопрос о сотворенности мира богом"),
            listOf("бога и человека", "бога и природы", "человека и природы", "науки и религии")
        )

        val trueAnswerList = mutableListOf(
            "Марксизм",
            "Учение о ценностях",
            "ФК о всеобщей одушевленности",
            "Платон",
            "Фалес",
            "Сократ",
            "Декарт",
            "То что вызывает ощущения но само не может быть познано",
            "Фейербах",
            "Кант",
            "Ницше",
            "Оно-сверхя-я",
            "Дедукция",
            "Средневековье",
            "Мировой дух",
            "Гегель",
            "Мораль",
            "Рационализм",
            "Бытии",
            "Признание первичности природы материи и вторичности (зависимости) сознания",
           // "Демокрит Маркс",
            "Учение о познании",
            "Сократ",
            "Аристотель",
            "Гераклит",
            "Демокрит",
            "теоцентризм",
            "Фома Аквинский",
            "утверждает, что реальным самостоятельным существованием обладают лишь единичные вещи а понятие общее всего лишь и имя",
            "бога и природы"
        )
        center {
            vbox {
                setPrefSize(800.0, 600.0)
                fun dz() {
                    val first = 0.1325489
                    val second = 0.4604551
                    val third = 0.9969748

                    val x1 = 0
                    val x2 = 0.25
                    val x3 = 0.5
                    val x4 = 0.75
                    val x5 = 1

                    println(1 - (first * x1 * x1 - second * x1 + third))
                    println(0.8888889 - (first * x2 * x2 - second * x2 + third))
                    println(0.8 - (first * x3 * x3 - second * x3 + third))
                    println(0.7272727 - (first * x4 * x4 - second * x4 + third))
                    println(0.6666667 - (first * x5 * x5 - second * x5 + third))

                }
                dz()
                var ask = ""
                var answer1 = ""
                var answer2 = ""
                var answer3 = ""
                var answer4 = ""
                var trueAnswer = ""

                var count1 = 0
                var count2 = 0

                var but1: RadioButton by singleAssign()
                var but2: RadioButton by singleAssign()
                var but3: RadioButton by singleAssign()
                var but4: RadioButton by singleAssign()
                var task: TextArea by singleAssign()

                var count: Label by singleAssign()
                fun random() {
                    val random = Random.nextInt(0, listAnswer.size)
                    ask = listTasks[random]
                    answer1 = listAnswer[random][0]
                    answer2 = listAnswer[random][1]
                    answer3 = listAnswer[random][2]
                    answer4 = listAnswer[random][3]
                    trueAnswer = trueAnswerList[random]

                    listAnswer.removeAt(random)
                    listTasks.removeAt(random)
                    trueAnswerList.removeAt(random)
                    println(listAnswer.size)
                }
                random()


                subscribe<EventTest> {
                    random()
                    but1.text = answer1
                    but2.text = answer2
                    but3.text = answer3
                    but4.text = answer4
                    task.text = ask
                    count.text = "$count1 из $count2"
                    but1.isSelected = false
                    but2.isSelected = false
                    but3.isSelected = false
                    but4.isSelected = false
                    println("change")
                }
                anchorpane {
                    task = textarea(ask) {
                        setPrefSize(500.0, 250.0)
                        translateX = 150.0
                        translateY = 5.0
                        isWrapText = true
                        isEditable = false

                    }
                }
                var checkBut = ""
                val toggleGroup = ToggleGroup()
                anchorpane {
                    vbox {
                        but1 = radiobutton(answer1, toggleGroup) {
                            translateY = 20.0
                            translateX = 150.0
                            action {
                                if (isSelected) checkBut = answer1
                            }
                        }
                        but2 = radiobutton(answer2, toggleGroup) {
                            translateY = 20.0
                            translateX = 150.0
                            action {
                                if (isSelected) checkBut = answer2
                            }
                        }
                        but3 = radiobutton(answer3, toggleGroup) {
                            translateY = 20.0
                            translateX = 150.0
                            action {
                                if (isSelected) checkBut = answer3
                            }
                        }
                        but4 = radiobutton(answer4, toggleGroup) {
                            translateY = 20.0
                            translateX = 150.0
                            action {
                                if (isSelected) checkBut = answer4
                            }
                        }

                        button("CHECK") {
                            translateX = 250.0
                            translateY = 50.0
                            setPrefSize(300.0, 30.0)

                            action {
                                println(checkBut == trueAnswer)
                                if (checkBut == trueAnswer) count1++
                                count2++
                                println(trueAnswer)
                                if(count2 == 29)  {
                                    close()
                                    find<Start>().openWindow()
                                }
                                fire(EventTest())
                            }
                        }

                        count = label("$count1 из $count2") {
                            translateX = 250.0
                            translateY = 75.0
                            setPrefSize(300.0, 60.0)
                            alignment = Pos.CENTER
                            style {
                                fontSize = 42.px
                            }
                        }
                   }
                }
            }
        }
    }
}
