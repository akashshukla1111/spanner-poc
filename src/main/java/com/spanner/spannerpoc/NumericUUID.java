package com.spanner.spannerpoc;

import java.util.Random;
import java.util.stream.Collectors;

public class NumericUUID {

    private NumericUUID() {
    }

    public static String generateUUID() {
      return new Random().ints(16, 0, 10)
                         .mapToObj(String::valueOf)
                         .collect(Collectors.joining());
  }
}