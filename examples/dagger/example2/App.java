package examples.dagger.example2;

import dagger.Component;

public class App {
  public static void main(String[] args) {
    SomeComponent someComponent = DaggerSomeComponent.builder().build();
    someComponent.getClass3Object().run();
  }
}