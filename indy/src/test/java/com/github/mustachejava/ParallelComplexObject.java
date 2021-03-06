package com.github.mustachejava;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class ParallelComplexObject {
  String header = "Colors";
  Callable<List<Color>> item = new Callable<List<Color>>() {
    @Override
    public List<Color> call() throws Exception {
      return Arrays.asList(
              new Color("red", true, "#Red"),
              new Color("green", false, "#Green"),
              new Color("blue", false, "#Blue"));
    }
  };

  boolean list() {
    return true;
  }

  boolean empty() {
    return false;
  }

  private static class Color {
    boolean link() {
      return !current;
    }

    Color(String name, boolean current, String url) {
      this.name = name;
      this.current = current;
      this.url = url;
    }

    String name;
    boolean current;
    String url;
  }
}
