package schach;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    int[][]dirs ={ { 1,  1},  // rechts oben
            { 1, -1},  // rechts unten
            {-1,  1},  // links oben
            {-1, -1}   // links unten
    };
    for(int i = 0;i< dirs.length;i++){
      int dxStep = dirs[i][0];
      int dyStep = dirs[i][1];

      int dx = x+dxStep;
      int dy = y+dyStep;

      while(dx>=1&&dx<=8&&dy>=1&&dy<=8){
        brett.markiereFeld(dx,dy);
        dx=dx+dxStep;
        dy=dy+dyStep;
      }
    }
    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5);
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x");
        else System.out.print("o");
      }
      System.out.println();
    }
    System.out.println();
  }
}
