import java.io.*;


public class Medlemsoplysninger {

  private String fornavn;
  private String efternavn;
  private String aktivitetsform;
  private String disciplin;
  private String stævneNavn;
  private String dato;
  private int alder;
  private int placering;
  private double tid;
  private double stævneTid;
  private double pris;


  public void gemMedlemInfo(String gemMedlemInfo) throws Exception {    //Gemmer til fil
    PrintStream nytMedlemInfo = new PrintStream(new FileOutputStream(gemMedlemInfo, true));
    nytMedlemInfo.println(toString());
    System.out.print("\n");
  }

  @Override
  public String toString() {
    return "Medlemsoplysninger{" +
        "fornavn='" + fornavn + '\'' +
        ", efternavn='" + efternavn + '\'' +
        ", medlemsskab='" + aktivitetsform + '\'' +
        ", disciplin='" + disciplin + '\'' +
        ", stævneNavn='" + stævneNavn + '\'' +
        ", alder=" + alder +
        ", tid=" + tid +
        ", stævneTid=" + stævneTid +
        ", placering=" + placering +
        ", pris=" + pris +
        ", dato='" + dato + '\'' +
        '}';
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

  public String getStævneNavn() {
    return stævneNavn;
  }

  public void setStævneNavn(String stævneNavn) {
    this.stævneNavn = stævneNavn;
  }

  public int getAlder() {
    return alder;
  }

  public void setAlder(int alder) {
    this.alder = alder;
  }

  public double getTid() {
    return tid;
  }

  public void setTid(double tid) {
    this.tid = tid;
  }

  public double getStævneTid() {
    return stævneTid;
  }

  public void setStævneTid(double stævneTid) {
    this.stævneTid = stævneTid;
  }

  public int getPlacering() {
    return placering;
  }

  public void setPlacering(int placering) {
    this.placering = placering;
  }

  public double getPris() {
    return pris;
  }

  public void setPris(double pris) {
    this.pris = pris;
  }

  public String getDato() {
    return dato;
  }

  public void setDato(String dato) {
    this.dato = dato;
  }

  /*
  //Arraylist til fil, skrives
  public void filSkrivning() throws IOException, FileNotFoundException {
    FileOutputStream fo = new FileOutputStream(file,true);
    ObjectOutputStream pw = new ObjectOutputStream(fo);
    for (int i = 0; i < medlemsoplysninger.size(); i++) {
      pw.writeObject(medlemsoplysninger.toString().replace("[", "").replace("]", ""));
    }
    {
      pw.close();
      fo.close();
    }
  }


  //Arraylist til fil, læses
  public void filLæsning()  {

    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String line;
      while ((line = br.readLine()) != null)  {
        System.out.println(line);
      }
    } catch (IOException e) {
    }
    /*
    try {
      FileInputStream fis = new FileInputStream(file);
      ObjectInputStream ois = new ObjectInputStream(fis);
      Medlemsoplysninger medlemsoplysninger = (Medlemsoplysninger) ois.readObject();
      ois.close();
      fis.close();
      System.out.println(getMedlemsoplysninger().toString());


    } catch (Exception e) {
      e.printStackTrace();
    }

     */


}



