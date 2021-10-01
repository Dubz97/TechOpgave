import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*

  Linje 44 Submenu  (Switchmenu med handlinger under kasserer)
  Linje 82 Betalingsstatus
  Linje 107 Vis restance

 */

public class Kasserer extends Ansat {


  public Kasserer() {
  }

  public Kasserer(String fornavn, String efternavn, String restance) {
    setFornavn(fornavn);
    setEfternavn(efternavn);
    setRestance(restance);
  }

  public Kasserer(String fornavn, String efternavn, int alder, String medlemsskab) {
    setFornavn(fornavn);
    setEfternavn(efternavn);
    setAlder(alder);
    setMedlemsskab(medlemsskab);
  }

  public Kasserer(String fornavn, String efternavn, int alder, String medlemsskab, String disciplin, double tid, String dato) {
    setFornavn(fornavn);
    setEfternavn(efternavn);
    setAlder(alder);
    setMedlemsskab(medlemsskab);
    setDisciplin(disciplin);
    setTid(tid);
    setDato(dato);
  }

  public void subMenu() throws Exception {
    Scanner scan = new Scanner(System.in);


    while (choice != 0) {
      System.out.println("1. Vis restance\n2. Vis betalingsstatus\n3. Rediger kontigent\n4. Vis kontigent pris" +
          "\n0. Tilbage til hovedmenu");

      int choice = scan.nextInt();

      switch (choice) {
        case 1:
          visRestance();
          this.choice = 0;
          break;
        case 2:
          betalingsstatus();
          this.choice = 0;
          break;
        case 3:
          //redigerKontigent(scan); //Ikke lavet, løb tør for tid
          this.choice = 0;
          break;
        case 4:
          //kontingentPris(scan); //Ikke lavet, løb tør for tid
          this.choice = 0;
          break;
        case 0:
          this.choice = -1; //for at den ikke også hopper ud af ansats menu
          super.vælgAnsat(); //menu hos ansat
          break;
        default:
          System.out.println("TAST VENLIGST ET NUMMER DER ER FREMVIST\n");
          subMenu();
      }
    }
  }

  public void betalingsstatus() throws Exception {
    Scanner status = new Scanner(new File("visRestance.txt"));
    System.out.printf("%-10s%-15s%-10s\n", "Fornavn", "Efternavn", "Status");
    System.out.printf("---------------------------------\n");
    while (status.hasNextLine()) {
      String line = status.nextLine();
      Scanner scan = new Scanner(line);

      String navn = scan.next();
      setFornavn(navn);

      String efternavn = scan.next();
      setEfternavn(efternavn);

      String restance = scan.next();
      setRestance(restance);


      System.out.printf("%-10s%-15s%-10s", getFornavn(), getEfternavn(), getRestance());
      System.out.println();
    }
    System.out.println();
    subMenu();
  }

  public void visRestance() throws Exception {
    Scanner scan = new Scanner(new File("visRestance.txt"));
    System.out.printf("%-12s%-15s%-10s\n", "Fornavn", "Efternavn", "Status");
    System.out.printf("-----------------------------------\n");


    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      Scanner scanner = new Scanner(line);

      String navn = scanner.next();
      setFornavn(navn);

      String efternavn = scanner.next();
      setEfternavn(efternavn);

      String restance = scanner.next();
      setRestance(restance);

      if (restance.equalsIgnoreCase("Restance")) {  //Viser restance lige meget hvilken case de skriver på listen

        System.out.printf("%-12s%-15s%-10s", getFornavn(), getEfternavn(), getRestance());
        System.out.println();
      }


    }
    System.out.println();
    subMenu();
  }

  @Override
  public String toString() {
    return " ";
  }
}