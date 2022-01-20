package de.fbauer;

public class Item {
   // Pokeball
   // Trank
   private String name;
   private double preis;

   public Item(String name, double preis) {
      this.name = name;
      this.preis = preis;
   }

   public String getName() {
      return this.name;
   }

   public double getPreis() {
      return this.preis;
   }
}
