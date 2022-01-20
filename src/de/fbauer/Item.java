package de.fbauer;

public class Item implements IDaten {
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

   @Override
   public void speichern() {
      System.out.println("Speichern in Item");
   }

   @Override
   public void laden() {
      System.out.println("Laden in Item.");
   }
}
