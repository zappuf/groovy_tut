class GroovyOutput{
  static void main(String[] arg){
    // ---------- OUTPUT ----------
    // With double quotes we can insert variables
    def randString = "Random";
    println("A $randString string");

    // You can do the same thing with printf
    printf("A %s string \n", randString);

    // Use multiple values
    printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);

    // Single quotes are string literals
    println('A $randString string');
  }
}
