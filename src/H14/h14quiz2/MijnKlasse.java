package src.H14.h14quiz2;

public class MijnKlasse implements InterfaceA,InterfaceB
{
  // int MAX_TOEGESTAAN; /*1*/
  int z = 2;
  public void mijnMethode()
  {
    z = MAX_TOEGESTAAN + 4;
    System.out.print("H");
  }
  public void mijnMethode(char j)
  {
    // MAX_TOEGESTAAN += 3; /* 2*/
    mijnMethode();
    System.out.print(j);
    System.out.print(z);
  }
  public int som()
  {
    return MAX_TOEGESTAAN + z;
  }
  public static void main(String[] args)
  {
    MijnKlasse mk = new MijnKlasse();
    mk.mijnMethode('K');
  }
}
