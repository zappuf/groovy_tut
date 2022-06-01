class GroovyRange{
  static void main(String[] arg){
    // Ranges represent a range of values in shorthand notation

    def oneTo10 = 1..10;
    def aToZ = 'a'..'z';
    def zToA = 'z'..'a';

    println(oneTo10);
    println(aToZ);
    println(zToA);

    // Get size
    println("Size " + oneTo10.size());

    // get index
    println("2nd Item " + oneTo10.get(1));

    // Check if range contains
    println("Contains 11 " + oneTo10.contains(11));
    println("Does it contain 3 and 6? " + oneTo10.containsAll([3,6]));
    println("Does it contain 7 and 12? " + oneTo10.containsAll([7,12]));


    // Get last item
    println("Get Last " + oneTo10.getTo());

    println("Get First " + oneTo10.getFrom());

    //Iterate a range using for loop
    for (num in oneTo10) { print("$num, ") };
    println();
    oneTo10.each { num -> print("$num, ") }
    println();

    for (letter in aToZ) { print("$letter, ") };
    println();
    aToZ.each { letter -> print("$letter, ") };
    println();

    for (letter in zToA) { print("$letter, ") };
    println();
    zToA.each { letter -> print("$letter, ") };
    println();

    //Use step to custmize increment
    def odds = (1..10).step(2); //parens here needed for .step()
    def evens = (2..10).step(2);

    odds.each { num -> print("$num, ") };
    println();
    evens.each { num -> print("$num, ") };
    println();
  }
}
