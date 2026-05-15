package schach;

public class Brett {
  boolean[][] brett = new boolean[8][8];

  public Brett(){

  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  public Brett kombiniere(Brett anderes){
    Brett a = new Brett();
    for(int x = 1;x<=8;x++){
      for(int y = 1;y<=8;y++){
        boolean alt =this.gibFeld(x,y);
        boolean ander = anderes.gibFeld(x,y);

        if(alt||ander){
          a.markiereFeld(x,y);
        }

      }

    }
    return a;

  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
}
