public class Motionist extends Medlemsoplysninger {

  public Motionist(String fornavn, String efternavn, int alder, String medlemsskab) throws Exception {
    setFornavn(fornavn);
    setEfternavn(efternavn);
    setAlder(alder);
    setAktivitetsform(medlemsskab);

    super.gemMedlemInfo("motionister.txt");     //Gemt i fil

    System.out.println("Medlem gemt som motionist!");
  }


  @Override
  public String toString() {
    return getFornavn() + " " + getEfternavn() + " " + getAlder() + " " + getAktivitetsform();
  }
}