package Aufgabe5

class Mitarbeiter(
    var name: String,
    var id: Int = 0,
    var position: String,
    var gehalt: Double,
    var artDerBeschaeftigung: String,
    var mutterschaftsUrlaub: Boolean
) {
    fun gehaltAusgaben(name: String, gehalt: Double) {
        println("$name: Gehalt:$gehalt €.")
    }

    fun befoerdern(position: String) {
        if (position == "Azubi"){
            this.gehalt += 700.0
        } else if (position == "Angestellter") {
            gehalt += 1600.00
        } else if (position == "Vorarbeiter") {
            gehalt += 1200.00
        } else if (position == "Meister"){
            gehalt += 1500.00
        } else if (position == "Manager") {
            gehalt += 5000.00
        } else if (position == "Boss") {
            gehalt += 40000.00
        }
    }

    fun istVeruegbar() {
        var listRandom = listOf(true, false)
        var bool =listRandom.random()
        if (bool == true) {
            println("Ist Verfügbar.")
        }
        else {
            println("Ist nicht verfügbar.")
        }
    }

}