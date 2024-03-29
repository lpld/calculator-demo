package ua.dp.skillsup.java0.calculator;

import ua.dp.skillsup.java0.calculator.input.ConsoleInput;
import ua.dp.skillsup.java0.calculator.input.StringInput;
import ua.dp.skillsup.java0.calculator.output.ConsoleOutput;

/**
 * Точка входа в программу.
 *
 * @author leopold
 * @since 9/12/16
 */
public class CalculatorDemo {

  public static void main(String[] args) {
    runFromConsole();

    // runFromString();
  }


  private static void runFromConsole() {
    new Calculator(new ConsoleInput(), new ConsoleOutput()).run();
  }

  private static void runFromString() {
    new Calculator(
        new StringInput("((7 - 8) * 11) + (66 / 2)"),
        new ConsoleOutput()
    ).run();
  }

}

