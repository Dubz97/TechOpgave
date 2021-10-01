public class Pensionist extends Medlemsoplysninger {

  @Override
  public double getPris() {
    return super.getPris() + (1600.0*0.75); }
}
