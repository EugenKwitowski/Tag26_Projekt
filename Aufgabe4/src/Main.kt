fun main(){

    var person = Person()
    var sprechen = person.methodSpeak()
    person.age = 19
    println("Die Person sagt ${sprechen} und ist ${person.age} Jahre alt.") //

}