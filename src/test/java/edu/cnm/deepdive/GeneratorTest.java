package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneratorTest {




  @Test
  void isPerfectCube_cubes() {
    final int[] inputs = {
        -1,
        0,
        1,
        8,
        -8,
        27,
        -27
    };
    for (int input : inputs) {
      assertTrue(Generator.isPerfectCube(input));
    }
  }

  @Test
  void isPerfectCube_nonCubes() {
    final int[] inputs = {
        -3,
        9,
        16,
        25
    };
    for (int input : inputs) {
      assertFalse(Generator.isPerfectCube(input));
    }
  }
}