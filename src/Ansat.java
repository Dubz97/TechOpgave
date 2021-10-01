import java.util.Scanner;

public class Ansat {
  Scanner scan = new Scanner(System.in);

  //Bliver også brugt af sub classes
  private String fornavn;
  private String efternavn;
  private int alder;
  private String restance;
  private String aktivitetsform;
  private String disciplin;
  private double tid;
  private double staevneTid;
  private String staevneNavn;
  private int placering;
  private String dato;
  public int choice = -1;
  private String medlemsskab;

  public void vælgAnsat() throws Exception {
    Kasserer kasserer = new Kasserer();
    Formand formand = new Formand();
    Træner træner = new Træner();             //Ikke lavet, løb tør for tid

    System.out.println("1 for formand\n2 for kasserer\n3 for trænere\n4 for at afslutte");

    while (this.choice != 0) {     //Hovedmenuen hvor man logger ind som den ansatte man er og derefter styrer under ens subklasse
      int choice = scan.nextInt();
      switch (choice) {
        case 1:
          formand.subMenu();     //Formand login
          break;
        case 2:
          kasserer.subMenu();   //Kasserer Login
          break;
        case 3:
          //Træner login, ikke lavet pt.. //Ikke lavet, løb tør for tid
          break;
        case 4:
          this.choice=0;
          System.out.println("Afslutter program");
          break;
        default:
          System.out.println("Forkert nr, prøv igen");
          vælgAnsat();
          break;
      }
      this.choice = 0;
    }
  }

  @Override
  public String toString() {
    return " ";
  }

  public String getFornavn() {
    return fornavn;
  }

  public void setFornavn(String fornavn) {
    this.fornavn = fornavn;
  }

  public String getEfternavn() {
    return efternavn;
  }

  public void setEfternavn(String efternavn) {
    this.efternavn = efternavn;
  }

  public int getAlder() {
    return alder;
  }

  public void setAlder(int alder) {
    this.alder = alder;
  }

  public String getRestance() {
    return restance;
  }

  public void setRestance(String restance) {
    this.restance = restance;
  }

  public String getAktivitetsform() {
    return aktivitetsform;
  }

  public void setAktivitetsform(String aktivitetsform) {
    this.aktivitetsform = aktivitetsform;
  }

  public String getDisciplin() {
    return disciplin;
  }

  public void setDisciplin(String disciplin) {
    this.disciplin = disciplin;
  }

  public double getTid() {
    return tid;
  }

  public void setTid(double tid) {
    this.tid = tid;
  }

  public double getStaevneTid() {
    return staevneTid;
  }

  public void setStaevneTid(double staevneTid) {
    this.staevneTid = staevneTid;
  }

  public String getStaevneNavn() {
    return staevneNavn;
  }

  public void setStaevneNavn(String staevneNavn) {
    this.staevneNavn = staevneNavn;
  }

  public String getMedlemsskab() {
    return medlemsskab;
  }

  public void setMedlemsskab(String medlemsskab) {
    this.medlemsskab = medlemsskab;
  }

  public int getPlacering() {
    return placering;
  }

  public void setPlacering(int placering) {
    this.placering = placering;
  }

  public String getDato() {
    return dato;
  }

  public void setDato(String dato) {
    this.dato = dato;
  }
}
