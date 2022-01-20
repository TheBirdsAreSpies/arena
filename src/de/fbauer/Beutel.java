package de.fbauer;

import java.util.LinkedList;

public class Beutel {
   private LinkedList<Item> inhalt = new LinkedList<>(); // Alternative zu Konstruktor

   public Beutel() {
      // inhalt = new LinkedList<>();
   }

   public Beutel(Item item) {
      this();
      this.add(item);
   }

   public void add(Item item) {
      this.inhalt.add(item);
   }

   public Item getItem(int index) {
      return this.inhalt.get(index);
   }
}
