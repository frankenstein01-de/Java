package schach;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
  }
  public Brett kombiniere(Brett anders){
    Brett neu =new Brett();
    for(int x=1;x<=8;x++){
      for(int y=1;y<=8;y++){
        boolean felDieses =this.gibFeld(x,y);
        boolean feldAnderes= anders.gibFeld(x,y);

        if(felDieses||feldAnderes){
          neu.markiereFeld(x,y);

        }
      }
    }
    return neu;
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }


}
