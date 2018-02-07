package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
 * @param  parameter
 * @return  the result at the specified URL
 * @see         Image
 */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
