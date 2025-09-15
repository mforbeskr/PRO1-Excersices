package session0_homestudio;

import java.util.Scanner;

public class ScanTing
{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String adjective1;
    String adjective2;
    String noun1;
    String verb1;
    String noun2;
    String adjective3;
    String verb2;
    String noun3;


    //  SENTENCE GAME //

    System.out.print("Færdiggør de følgende sætninger med ét enkelt ord:\n");


    System.out.print("\nI nat har jeg sovet ");
    adjective1 = scan.nextLine();
    System.out.print("Det synes jeg er ");
    adjective2 = scan.nextLine();
    System.out.print("Nu skal jeg have mig en ");
    noun1 = scan.nextLine();
    System.out.print("så jeg kan fortsætte dagen. Efter det, så skal jeg (udsagnsord) ");
    verb1 = scan.nextLine();
    System.out.print("ned til butikken og købe mad til min kæreste..."
        + "¯\\(ツ)/¯ Jeg tror gerne han vil have en ");
    noun2 = scan.nextLine();
    System.out.print("i dag, de smager også bare så ");
    adjective3 = scan.nextLine();
    System.out.print("altså!\nDet gør jeg, og i dag skal jeg huske at ");
    verb2 = scan.nextLine();
    System.out.print("ham :))! Jeg savner den lille (spansk ord, starter med; c) ");
    noun3 = scan.nextLine();
    System.out.print("og min abdaghali derhjemme. Vi ses!\n");


    // SAMLET TXT OUTPUT //
    System.out.println("\nHvilket giver dig denne samlede tekst:\n");

    System.out.println("\nI nat har jeg sovet " + adjective1 + ".");
    System.out.println("Det synes jeg er " + adjective2 + "...");
    System.out.println("Nu skal jeg have mig en " + noun1 + " så jeg kan fortsætte dagen. Efter det, så skal jeg (udsagnsord)");
    System.out.println( verb1 + " ned til butikken og købe mad til min kæreste... ¯\\(ツ)/¯  ");
    System.out.println("Jeg tror gerne han vil have en " + noun2 + " i dag");
    System.out.println("De smager også bare så " + adjective3 + " :) ");
    System.out.println("Det gør jeg, og i dag skal jeg huske at " + verb2 + " ham :)) ");
    System.out.println("Jeg savner den lille " + noun3 + " og min abdaghali derhjemme, så jeg må hellere igang!");

    scan.close();
  }

}
