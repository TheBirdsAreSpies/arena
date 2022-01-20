package de.fbauer;

import javax.swing.*;

public class Flug extends Pokemon implements IDaten {
   private boolean istFliegend;

   public Flug(String name, int level) {
      super(name, level, "Flug");
      this.istFliegend = false;
   }

   public void fliegen(String standort) {
      System.out.println("Ich fliege nach " + standort);
      istFliegend = true;
   }

   public boolean getIstFliegend() {
      return this.istFliegend;
   }

   @Override
   public void issBeere(Beere beere) {
      System.out.println("Pfui, Beeren!");
      System.out.println(this.getName() + " spuckt die Beere aus.");
   }

   @Override
   public void speichern() {
      System.out.println("Ich speichere in Flug.");
   }

   @Override
   public void laden() {
      System.out.println("Ich lade in Flug.");
   }
}
