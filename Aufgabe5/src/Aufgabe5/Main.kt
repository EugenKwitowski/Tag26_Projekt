package Aufgabe5


fun main() {

    var person1 = Mitarbeiter(
        "Anton",
        12345,
        "Manager",
        10000.00,
        "Bürokaufmann",
        true
    )
    person1.befoerdern("Boss")
    person1.position = "Boss"
    println("\nPerson1: Name: ${person1.name}, \nID: ${person1.id}, \nPosition: ${person1.position}, \nGehalt: ${person1.gehalt}, \nArt der Beschäftigung: ${person1.artDerBeschaeftigung}")
    person1.istVeruegbar()



    var person2 = Mitarbeiter(
        "Claudia",
        67890,
        "Meister",
        5000.00,
        "Büro",
        true
    )
    person2.befoerdern("Manger")
    person2.position = "Manager"
    println("\nPerson2: Name: ${person2.name}, \nID: ${person2.id}, \nPosition: ${person2.position}, \nGehalt: ${person2.gehalt}, \nArt der Beschäftigung: ${person2.artDerBeschaeftigung}")
    person2.istVeruegbar()

    var person3 = Mitarbeiter(
        "Hans",
        43589,
        "Vorarbeiter",
        3500.00,
        "Maler",
        true
    )
    person3.befoerdern("Meister")
    person3.position = "Meister"
    println("\nPerson3: Name: ${person3.name}, \nID: ${person3.id}, \nPosition: ${person3.position}, \nGehalt: ${person3.gehalt}, \nArt der Beschäftigung: ${person3.artDerBeschaeftigung}")
    person1.istVeruegbar()

    var person4 = Mitarbeiter(
        "Jurgen",
        76478,
        "Angestellter",
        2300.00,
        "Maler",
        true
    )
    person4.befoerdern("Meister")
    person4.position = "Meister"
    println("\nPerson4: Name: ${person4.name}, \nID: ${person4.id}, \nPosition: ${person4.position}, \nGehalt: ${person4.gehalt}, \nArt der Beschäftigung: ${person4.artDerBeschaeftigung}")
    person1.istVeruegbar()

    var person5 = Mitarbeiter(
        "Jack",
        76744,
        "Azubi",
        700.0,
        "Maler",
        true
    )
    person5.befoerdern("Angestellter")
    person5.position = "Angestellter"
    println("\nPerson5: Name: ${person5.name}, \nID: ${person5.id}, \nPosition: ${person5.position}, \nGehalt: ${person5.gehalt}, \nArt der Beschäftigung: ${person5.artDerBeschaeftigung}")
    person1.istVeruegbar()

}