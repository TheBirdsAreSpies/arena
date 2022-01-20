package de.fbauer;

/**
 *
 */
public class Item {
   // Pokeball
   // Trank
   private String name;
   private double preis;

   /**
    * Creates a new item.
    * @param name The name of the item
    * @param preis The items price
    */
   public Item(String name, double preis) {
      this.name = name;
      this.preis = preis;
   }

   /**
    * Returns the name of the item.
    * @return Le name
    */
   public String getName() {
      return this.name;
   }

   public double getPreis() {
      return this.preis;
   }
}
