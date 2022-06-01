class GroovyExceptionHandling{
  static void main(String[] arg){
    // ---------- EXCEPTION HANDLING ----------
    // Handles runtime errors

    try {
      File testFile;
      testFile.append('Line 5');
    }
    catch(NullPointerException ex){

      // Prints exception
      println("Caught exception: ${ex.toString()}");

      // Prints error message
      println("Caught error: ${ex.getMessage()}");
    }
    catch(Exception ex){
      println("I Catch Everything");
    }
    finally {
      println("I perform clean up")
    }
  }
}
