class GroovyMath{
  static void main(String[] arg){

    // ---------- MATH ----------
    // Everything in Groovy is an object
    // including numbers

    // def is used when you define a variable
    // Variables start with a letter and can
    // contain numbers and _
    // Variables are cynamically typed and can
    // hold any value

    def age = "Dog";
    age = 40;

    // The basic integer math operators
    println("\nBasic Math");
    println("5 + 4 = " + (5 + 4));
    println("5 - 4 = " + (5 - 4));
    println("5 * 4 = " + (5 * 4));
    println("5 / 4 = " + (5.intdiv(4)));
    println("5 % 4 = " + (5 % 4));

    // Floating point math operators
    println("\nFloat Math");
    println("5.2 + 4.4 = " + (5.2.plus(4.4)));
    println("5.2 - 4.4 = " + (5.2.minus(4.4)));
    println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
    println("5.2 / 4.4 = " + (5.2 / 4.4));

    // Order of operations
    println("\nOrder of operations")
    println("3 + 2 * 5 = " + (3 + 2 * 5));
    println("(3 + 2) * 5 = " + ((3 + 2) * 5));

    // Increment and decrement
    println("\nIncrement or decrement")
    println("age++ = " + (age++));
    println("++age = " + (++age));
    println("age-- = " + (age--));
    println("--age = " + (--age));

    // Largest values
    println("\nLargest or smallest values")
    println("Biggest Int " + Integer.MAX_VALUE);
    println("Smallest Int " + Integer.MIN_VALUE);

    println("Biggest Float " + Float.MAX_VALUE);
    println("Smallest Float " + Float.MIN_VALUE);

    println("Biggest Double " + Double.MAX_VALUE);
    println("Smallest Double " + Double.MIN_VALUE);

    // Decimal Accuracy
    println("\nDecimal accuracy example");
    println("1.1000000000000001111111111111111111111111111111111111 + 1.1000000000000001111111111111111111111111111111111111 "
    + (1.1000000000000001111111111111111111111111111111111111 + 1.1000000000000001111111111111111111111111111111111111));

    // Math Functions
    println("\nMore advanced math functions")
    def randNum = 2.0;
    println("Math.abs(-2.45) = " + (Math.abs(-2.45)));
    println("Math.round(2.45) = " + (Math.round(2.45)));
    println("randNum.pow(3) = " + (randNum.pow(3)));
    println("3.0.equals(2.0) = " + (3.0.equals(2.0)));
    println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
    println("Math.sqrt(9) = " + (Math.sqrt(9)));
    println("Math.cbrt(27) = " + (Math.cbrt(27)));
    println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
    println("Math.floor(2.45) = " + (Math.floor(2.45)));
    println("Math.min(2,3) = " + (Math.min(2,3)));
    println("Math.max(2,3) = " + (Math.max(2,3)));

    // Number to the power of e
    println("\nPower of e")
    println("Math.log(2) = " + (Math.log(2)));

    // Base 10 logarithm
    println("\nlog base 10")
    println("Math.log10(2) = " + (Math.log10(2)));

    // Degrees and radians
    println("\nConvert degrees to radians and vice versa")
    println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));
    println("Math.toRadians(90) = " + (Math.toRadians(90)));

    // sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
    println("\nTrig stuff")
    println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));

    // Generate random value from 1 to 100
    println("\nRandon numbers")
    println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));

  }
}
