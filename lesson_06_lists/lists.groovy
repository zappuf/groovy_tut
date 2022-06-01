class GroovyLists{
  static void main(String[] arg){
    // ---------- LISTS ----------
    // Lists hold a list of objects with an index

    def primes = [2,3,5,7,11,13];

    println("My list is $primes")

    // Get a value at an index
    println("2nd Prime " + primes[1]);
    println("3rd Prime " + primes.get(2));

    // They can hold anything
    def employee = ['Derek', 40, 6.25, [1,2,3]];

    println("2nd Number " + employee[3][1]);

    // Get the length
    println("Length " + primes.size());

    // Add an index
    primes.add(17);

    // Append to the right
    primes<<19;
    primes.add(23);

    // Concatenate 2 Lists
    def primes_cat = primes + [29,31]
    println("Primes cat is $primes_cat")
    primes + [29,31];
    // println("Primes after adding [29,31] is '$primes'")


    // Remove the last item
    primes - [31];

    // Check if empty
    println("Is empty " + primes.isEmpty());

    // Get 1st 3
    println("1st 3 " + primes[0..2]);

    println(primes);

    // Get matches
    println("Matches " + primes.intersect([2,3,7, 122]));

    // Reverse
    println("Reverse " + primes.reverse());

    // Sorted
    println("Sorted " + primes.sort());

    // Pop last item
    println("First " + primes.pop());
    println("Primes after first item popped $primes")

    //Remove last item
    println("Last " + primes.removeLast())
    println("Primes after last element removed $primes")

    // Push an element to the front of the list
    primes.push 2
    println("Primes after pushing 2 to the front $primes")
  }
}
