package de.fbauer;

public class Trainer {
   // Hält Pokemon
   public String name;
   public String beruf;
   public Pokemon[] pokemon;
   public boolean istBesiegt;
   public String kampfText;
   public String besiegtText;

   public Trainer(String name, String beruf, Pokemon[] pokemon, String kampfText, String besiegtText) {
      this.name = name;
      this.beruf = beruf;
      this.pokemon = pokemon;
      this.kampfText = kampfText;
      this.besiegtText = besiegtText;
   }

   public String getName() {
      return this.name;
   }

   public String getBeruf() {
      return this.beruf;
   }

   public Pokemon[] getPokemon() {
      return this.pokemon;
   }

   public boolean getIstBesiegt() {
      return this.istBesiegt;
   }

   public String getKampfText() {
      return this.kampfText;
   }

   public String getBesiegtText() {
      return this.besiegtText;
   }
}
