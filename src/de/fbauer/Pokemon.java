package de.fbauer;

import java.util.Arrays;

public class Pokemon {
   // Eigenschaften, Membervariablen, Attribute, Modulvariable
   // private accessor: Datenkapselung, nicht jede Klasse soll Zugriff auf die Eigenschaften haben
   // Zugriff soll gesichert durchgeführt werden
   private String name;
   private int level;
   private String typ;
   private String[] attacke;
   private double gewicht;
   private int initiative;
   private String vm;
   private int lebenspunkte;
   private int erfahrungspunkte;

   public Pokemon(String name, int level, String typ) {
      System.out.println("Hallo, ich bin ein neues Pokemon.");
      this.name = name;
      this.level = level;
      this.typ = typ;
   }

   public void lerneVm(String vm) {
      if (this.vm == null) {
         this.vm = vm;
         System.out.println("Ich habe " + vm + " gelernt!");
      } else {
         System.out.println("Ich habe bereits eine VM gelernt, du Dummerchen!");
      }
   }

   public void issBeere(Beere beere) {
      this.lebenspunkte += beere.getHp();
      System.out.println("Mjam! " + this.name + " lässt sich die Beere schmecken.");
   }

   public void angriff() {
      System.out.println("Hyüaaa!");
   }

   public void erfolgreicherKampf() {
      this.erfahrungspunkte += 400;
      if (erfahrungspunkte > 300) {
         this.erfahrungspunkte -= 300;
         this.level++;
         System.out.println("Hurra! " + this.name + " hat Level " + this.level + " erreicht.");
      }
   }

   @Override
   public String toString() {
      return "Pokemon{" +
              "name='" + name + '\'' +
              ", level=" + level +
              ", typ='" + typ + '\'' +
              ", attacke=" + Arrays.toString(attacke) +
              ", gewicht=" + gewicht +
              ", initiative=" + initiative +
              ", vm='" + vm + '\'' +
              ", lebenspunkte=" + lebenspunkte +
              ", erfahrungspunkte=" + erfahrungspunkte +
              '}';
   }

   // Getter
   public String getName() {
      if (attacke != null && attacke.length == 2) {
         return "Zweischuss " + this.name;
      }
      return this.name;
   }

   public int getLevel() {
      return this.level;
   }

   public String getTyp() {
      return this.typ;
   }

   public String[] getAttacke() {
      return this.attacke;
   }

   public double getGewicht() {
      return this.gewicht;
   }

   // Setter
   public void setName(String name) {
      this.name = name;
   }

   public void setLevel(int level) {
      this.level = level;
   }

   public void setTyp(String typ) {
      this.typ = typ;
   }

   public void setAttacke(String[] attacke) {
      this.attacke = attacke;
   }

   public void setGewicht(double gewicht) {
      this.gewicht = gewicht;
   }

   public int getInitiative() {
      return initiative;
   }

   public void setInitiative(int initiative) {
      this.initiative = initiative;
   }

   public int getLebenspunkte() {
      return this.lebenspunkte;
   }

   // Namen, Level, Typus, Attacken, Gewicht
   // Angriff, Verteidigung, Lernen von VM
}
