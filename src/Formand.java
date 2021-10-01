import java.util.Scanner;

/*
  Linje 18 submenu  (Switchmenu med handlinger under formand)
  Linje 41 Opret oplysninger
  Linje 52 Opret medlem
  Linje 69 Opret motionist
  Linje 78 Opret konkurrence svømmer
  Linje 93 Vælg svømme disciplin
  Linje 122 Vælg aktivitetsform
 */
public class Formand extends Ansat {


  public Formand() {
  }

  public void subMenu() throws Exception {
    Scanner scan = new Scanner(System.in);

    while (this.choice != 0) {
      System.out.println("1. Opret medlem\n2. Tilbage til main menuen");
      int choice = scan.nextInt();
      switch (choice) {
        case 1:
          opretMedlem(scan);
          subMenu();
          break;
        case 2:
          this.choice = -1;
          super.vælgAnsat(); //Hovede menuen i ansat klassen
          break;
        default:
          System.out.println("Tast venligst et nummer der er fremvist");
          subMenu();
      }
      this.choice=0;
    }
  }

  public void opretOplysninger(Scanner scan) {

    System.out.println("Indtast fornavn: ");
    setFornavn(scan.next());
    System.out.println("Indtast efternavn: ");
    setEfternavn(scan.next());
    System.out.println("Indtast alder: ");
    setAlder(scan.nextInt());

  }

  public void opretMedlem(Scanner scan) throws Exception {

    System.out.println("1. Opret motionist\n2. Opret konkurrencesvømmer");
    int choice = scan.nextInt();
    switch (choice) {
      case 1:
        opretMotionist(scan);
        break;
      case 2:
        opretKonkurrenceSvømmer(scan);
        break;
      default:
        System.out.println("Forkert, prøv igen");
        opretMedlem(scan);
    }
  }

  public void opretMotionist(Scanner scan) throws Exception {
    opretOplysninger(scan);

    aktivitetsform(scan);


    Motionist nytMedlem = new Motionist(getFornavn(), getEfternavn(), getAlder(), getAktivitetsform());
  }

  public void opretKonkurrenceSvømmer(Scanner scan) throws Exception {
    opretOplysninger(scan);

    aktivitetsform(scan);

    vælgDisciplin(scan);

    //Kode under træner ang bedste tider, setTider osv.



    KonkurrenceSvømmer nytMedlem = new KonkurrenceSvømmer(getFornavn(), getEfternavn(),
        getAlder(), getAktivitetsform(), getDisciplin(), getTid(), getDato());
  }

  public void vælgDisciplin(Scanner scan) throws Exception {


    while (this.choice != -2) {
      System.out.println("Vælg svømmedisciplin\n1. Butterfly\n2. Crawl\n3. Rygcrawl\n4. Brystsvømning\n0. Quit");

      int choice = scan.nextInt();

      switch (choice) {
        case 1:
          setDisciplin("Butterfly");
          break;
        case 2:
          setDisciplin("Crawl");
          break;
        case 3:
          setDisciplin("Rygcrawl");
          break;
        case 4:
          setDisciplin("Brystsvømning");
          break;
        default:
          System.out.println("Forkert nr, prøv igen");
          vælgDisciplin(scan);
      }
      this.choice = -2;  //quit (Forskellige int's så de ikke lukker de andre switches ned)
    }
  }

  public void aktivitetsform(Scanner scan) throws Exception {

    while (this.choice != -3) {
      System.out.println("Vælg aktivitetsform:\n1. Aktivt\n2. Passivt");
      int choice = scan.nextInt();

      switch (choice) {
        case 1:
          setAktivitetsform("Aktiv");
          break;
        case 2:
          setAktivitetsform("Passiv");
          break;
        default:
          System.out.println("Forkert nr, prøv igen");
          aktivitetsform(scan);
      }
      this.choice = -3; //Quit    (Forskellige int's så de ikke lukker de andre switches ned)
    }
  }
}