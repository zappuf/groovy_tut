class GroovyOOP{
  static void main(String[] arg){
    // ---------- OOP ----------
    // Classes are blueprints that are used to define objects
    // Every object has attributes (fields) and capabilities
    // (methods)

    // Create an Animal object with named parameters
    // def king = new Animal(name : 'King', sound : 'Growl');
    // or with a Constructor
    def king = new Animal('King', 'Growl');

    println("${king.name} says ${king.sound}");

    // Change an object attribute with a setter
    king.setSound('Grrrr');
    println("${king.name} says ${king.sound}");

    king.run();

    println(king.toString());

    // With inheritance a class can inherit all fields
    // and methods of another class
    def cavalier = new Dog('Reegan', 'Grrrrr', 'Frank');

    king.makeSound();
    cavalier.makeSound();
    println("$cavalier.name's owner is ${cavalier.getOwner()}")

    // Mammal inherits from the abstract class Thing
    def hamster = new Mammal('Furry');
    hamster.getInfo();

  }
}
