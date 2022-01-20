package de.fbauer;

public class Arena {
   public static void main(String[] args) {
      Rechnung rechnung = new Rechnung("sql");
      TestBla bla = new TestBla();

   }

   public static void main2(String[] args) {


      Pokemon raupi = new Pokemon("Raupi", 10, "Käfer");
      raupi.setInitiative(7);
      raupi.setGewicht(7.43);
      String[] attacken = {"Tackle", "Fadenschuss"};
      raupi.setAttacke(attacken);
      System.out.println(raupi.getName());

//      Pokemon raichu = new Pokemon();
//      raichu.setName("Raichu");
//      raichu.setGewicht(80);
//      raichu.setLevel(10);
//      raichu.setInitiative(9);
//      raichu.setTyp("Elektro");
//      String[] attackenRaichu = {"Tackle", "Elektroschock"};
//      raichu.setAttacke(attackenRaichu);
//
//
//      System.out.println(raichu.getTyp());
//      raupi = null;
//      System.out.println(raichu.getName());

      Pokemon hornliu = new Pokemon("Hornliu", 30, "Käfer");
      Pokemon bibor = new Pokemon("Bibor", 44, "Käfer");
      Pokemon pokemonA[] = { raupi, hornliu, bibor };

      Trainer fritz = new Trainer("Fritz",
              "Käfersammler",
              pokemonA,
              "Ich mach dich platt!",
              "Unfassbar! Du hast mich besiegt! Wie konntest du meine Käfer schlagen!?");


      hornliu.lerneVm("Surfer");
      hornliu.lerneVm("Zerschneider");
      raupi.lerneVm("Zerschneider");

      Flug taubsi = new Flug("Taubsi", 7);
      taubsi.fliegen("Nach Hause");
      Wasser turtok = new Wasser("Turtok", 54);
      //kampf(taubsi, turtok);

      Beere beere = new Beere("Beere", 1);
      taubsi.issBeere(beere);
      turtok.issBeere(beere);
      System.out.println(raupi);
      //System.out.println(bibor);

      Item pokeball = new Item("Pokeball", 10);
//
//      // Polymorphismus, Vielgestaltigkeit
//      Object obj;
//      obj = taubsi;
//      obj = pokeball;


      Pokemon pkm = taubsi;
      System.out.println("Mein Pokemon ist " + pkm.getName());

      taubsi.fliegen("Irgendwo");

      IDaten speicher = taubsi;
      IDaten daten[] = {taubsi, pokeball};

      for (IDaten obj : daten) {
         obj.speichern();
      }



      // kampf(hornliu, bibor);
   }

   public static void kampf(Pokemon pokemon1, Pokemon pokemon2) {
      if (pokemon1.getClass() == Flug.class) {
         Flug pkm = (Flug)pokemon1;
         pkm.fliegen("hin");
      }

      // pokemon kämpfen
      System.out.println("Ich schicke " + pokemon1.getName() + " in den Kampf");
      System.out.println(pokemon2.getName() + " stellt sich als Gegner.");

      System.out.println(pokemon2.getName() + " besiegt " + pokemon1.getName());
      System.out.println("Hui, " + pokemon2.getName() + " beginnt zu leuchten! Es scheint eine Stufe aufgestiegen zu sein.");

      pokemon2.erfolgreicherKampf();
      Beere schwarzbeere = new Beere("Schwarzbeere", 30);
      Beere totalbeere = new Beere("Totalbeere", 100);
      pokemon2.issBeere(schwarzbeere);
      pokemon2.issBeere(totalbeere);

   }

}
