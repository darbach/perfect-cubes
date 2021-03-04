package edu.cnm.deepdive;

/**
 *
 */
public class Generator {

  /**
   * Perfect cubes are integers which are the result of some integer raised to the 3rd power.
   * For example, −1=(−1)^3, 0=0^3, 1=1^3, 8=2^3, 27=3^3, etc. Thus, −1,0,1,8,27,… are perfect cubes.
   *
   * Your task is to implement a method that takes a long input parameter, and if the value of
   * that parameter is a perfect cube, returns true; if the input argument is not a perfect cube,
   * false must be returned.
   *
   * @param input An integer to evaluate.
   * @return True if input^3 = input.
   */
  public static boolean isPerfectCube(long input) {
    long cubeRoot = Math.round(Math.cbrt(input));
    return (cubeRoot * cubeRoot * cubeRoot == input);
  }
}
