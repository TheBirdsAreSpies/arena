package de.fbauer;

public class Flug extends Pokemon {
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
}
