package de.fbauer;

public class Wasser extends Pokemon {
   public Wasser(String name, int level) {
      super(name, level, "Wasser");
   }

   public void surfen() {
      System.out.printf("Surfin!");
   }
}
