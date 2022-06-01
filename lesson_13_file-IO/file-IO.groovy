class GroovyFileIO{
  static void main(String[] arg){
    // ---------- FILE IO ----------
    // Open a file, read each line and output them

    File myfile = new File("test.txt")

    if (myfile.exists()) {
      println("File exists!");
      } else {
      println("File does NOT exist, will create file now.");
      myfile.withWriter('utf-8') {
        writer -> writer.writeLine("Line 1");
      }
      myfile.append('Line 2\n');
      myfile.append('Line 3\n');
    }

    // Print each line of a file
    myfile.eachLine {
      line -> println "$line";
    }

    // Overwrite the file
    myfile.withWriter('utf-8') {
      writer -> writer.writeLine("Line 4");
    }

    // Sleep 3 seconds
    sleep(3000);

    // Append the file
    myfile.append('Line 5\n');

    // Get the file as a string
    println("Print file as string:\n$myfile.text");

    // Get the file size
    println("File Size : ${myfile.length()} bytes");

    // Check if a file or directory
    println("File : ${myfile.isFile()}");
    println("Dir : ${myfile.isDirectory()}");

    // Copy file to another file
    def newFile = new File("test2.txt");
    newFile << myfile.text;

    // Another way to create a new file
    def anotherNewFile = new File("test3.txt");
    anotherNewFile.text = "Sample text\nMore text on a newline\n"


    // Sleep 3 seconds
    sleep(3000);

    // Delete a file
    newFile.delete();

    // Get directory files
    def dirFiles = new File("").listRoots();
    dirFiles.each {
      item -> println myfile.absolutePath;
    }

    // Delete our test files
    if (myfile.exists()) {
      println("File exists and will delete it now.");
      myfile.delete();
    } 
    if (anotherNewFile.exists()) {
      anotherNewFile.delete();
    }

  }
}
