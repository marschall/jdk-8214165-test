package com.github.marschall.jdk8214165test.normalmodule;

import java.lang.invoke.MethodHandles;

public class NormalModule {

  public static void main(String[] args) {
    System.out.println(MethodHandles.lookup().lookupClass().getName());
  }

}
