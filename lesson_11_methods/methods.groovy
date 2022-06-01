class GroovyMethods{
  // ------- Methods defined here -------

  static def sayHello(){
    println("hello");
  }

  static def getSum(num1=0, num2=0){
    return num1 + num2
  }

  // Object passed to a method is pass by value not passing the object itself
  static def passByValue(name){
    name = "In Function";
    println("Name : " + name);
  }

  // Receive and return a list
  static def doubleList(list){
    // Collect performs a calculation on every item in the list
    def newList = list.collect { it * 2};
    return newList;
  }

  // Pass unknown number of elements to a method
  static def sumAll(int... num){
    def sum = 0;

    // Performs a calculation on every item with each
    num.each { sum += it; }
    return sum;
  }

  // Calculate factorial (Recursion)
  static def factorial(num){
    if(num <= 1){
      return 1;
    } else {
      return (num * factorial(num - 1));
    }
  }

  static void main(String[] arg){
    // ---------- METHODS ----------
    // Methods allow us to break our code into parts and also
    // allow us to reuse code

    sayHello();

    // Pass parameters
    println("5 + 4 = " + getSum(5,4));

    // Demonstrate pass by value
    def myName = "Derek";
    passByValue(myName);
    println("In Main : " + myName);

    // Pass a list for doubling
    def listToDouble = [1,2,3,4];
    listToDouble = doubleList(listToDouble);
    println(listToDouble);

    // Pass unknown number of elements to a method
    def nums = sumAll(1,2,3,4);
    println("Sum : " + nums);

    // Calculate factorial (Recursion)
    def fact4 = factorial(4);
    println("Factorial 4 : " + fact4);
    
  }
}
