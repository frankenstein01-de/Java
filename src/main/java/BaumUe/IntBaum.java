package BaumUe;

public class IntBaum<I extends Comparable<I>>{
    public static class Knoten<I>{
        private Knoten<I> left;
        private Knoten<I> right;
        I inhalt;
        public Knoten(I inhalt){
            this.inhalt=inhalt;
            this.left=null;
            this.right=null;
        }
    }
    private Knoten<I> root;

    public void add(I wert){
        root = addRecursive(root,wert);
    }
    private Knoten<I> addRecursive(Knoten<I> current,I wert){
        if(root==null){
            return new Knoten<>(wert);
        }
        int vergleich = wert.compareTo(current.inhalt);
        if(vergleich<0){
            current.left=addRecursive(current.left,wert);
        }else{
            current.right=addRecursive(current.right,wert);
        }
        return current;

    }


}
