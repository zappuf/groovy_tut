class GroovyMaps{
  static void main(String[] arg){
    // ---------- MAPS ----------
    // List of objects with keys versus indexes, similar to Python dict

    def paulMap = [
      'name' : 'Paul',
      'age' : 35,
      'address' : '123 Main St',
      'list' : [1,2,3]
    ];

    // Access with key
    println("Name " + paulMap['name']);
    println("Age " + paulMap.get('age'));
    println("List Item " + paulMap['list'][1]);

    // Add key value
    paulMap.put('city', 'Pittsburgh');
    paulMap['zip'] = '09021'
    paulMap.country = 'US'

    // Check for key
    println("Has City " + paulMap.containsKey('city'));

    // Size
    println("Size " + paulMap.size());

    println("paulMap is $paulMap");

    // Remove item
    paulMap.remove('country');
    println("paulMap after country removed $paulMap");

    //Collect entries method used for iterating through map transforming each
    //entry
    def colEntries = paulMap.collectEntries {key, value -> [value, key]};
    println colEntries;

    colEntries = paulMap.collectEntries {key, value -> [value, key.toUpperCase()]};
    println colEntries;

    //Create a map from a simple list
    def simpleList = ["JAX", "ResearchIT", "Faculty", "Mice", "Computer Science"];
    def simpleMap = simpleList.collectEntries{ [(it.length()*2):it] };
    println("simpleList - $simpleList");
    println simpleMap;

    //Count items in a map
    def numberMap = [nbr1: 11, nbr2: 12, nbr3: 13, nbr4: 14, nbr5: 15];
    println numberMap.count { it.value % 2 };
    //count a group of items which the value modulus by 2 equals 0 or 1 using
    //the countBy method
    println numberMap.countBy { it.value % 2 };

    //Map Intersect
    def map1 = [a: 1, b: 2, c: 3, d: 4, e: 5];
    def map2 = [a: 1, b: 6, c: 3, d: 8, e: 9];
    println map1;
    println map2;
    println("Intersect of map1 & map2 is " + map1.intersect(map2));

    //Map iteration
    map1.each {myvar -> println "$myvar.key:$myvar.value"};
    map1.eachWithIndex {myvar, idx -> println "$idx $myvar.key:$myvar.value"};

    //Find from the Map
    println map1.findAll { it.value > 2 };
    println map1.findAll { it.value < 2 };
    println map1.findAll { it.value == 3 };
    println map1.findAll { it.key == "d" };
  }
}
