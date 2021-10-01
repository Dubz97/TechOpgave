public class KonkurrenceSvømmer extends Medlemsoplysninger{

  public KonkurrenceSvømmer(String fornavn, String efternavn, int alder, String aktivitetsform, String disciplin, double tid, String dato)throws Exception{
    setFornavn(fornavn);
    setEfternavn(efternavn);
    setAlder(alder);
    setAktivitetsform(aktivitetsform);
    setDisciplin(disciplin);
    setTid(tid);
    setDato(dato);

    super.gemMedlemInfo("konkurrenceSvømmere.txt");

    System.out.println("Medlem gemt som konkurrencesvømmer!");
  }

  @Override
  public String toString(){
    return getFornavn()+" "+getEfternavn()+" "+getAlder()+" "
        +getAktivitetsform()+" "+getDisciplin()+" "+getTid()+" "+getDato();
  }
}
