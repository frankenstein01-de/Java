package Le22;

import java.util.Objects;

public class Baum<E extends Comparable<E>>
{
    public static class Knoten<E>
    {
        Knoten<E> left;
        Knoten<E> right;
        E content;
    }

    Knoten<E> root;
    public void einfuegen(E content) {
        if(root==null){
            root= new Knoten();
            root.content=content;
        }else{
            einfuegenRekursiv(root, content);
        }
    }
    private void einfuegenRekursiv(Knoten current,E content){
        int vergleiche = content.compareTo((E)current.content);
        if(vergleiche<0){
            if(current.left==null){
                current.left=new Knoten();
                current.left.content=content;
            }else{
                einfuegenRekursiv(current.left,content);
            }
        }else{
            if(current.right==null){
                current.right=new Knoten();
                current.right.content=content;
            }else{
                einfuegenRekursiv(current.right,content);
            }
        }
    }
    protected void traversiere(Visitor<E> visitor)
    {
        if (root == null) return;
        else traversiere(root, visitor);
    }
    protected void traversiere(Knoten<E> current, Visitor<E> visitor)
    {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }
    public int size(){
        SizeVisitor visitor= new SizeVisitor();
        this.traversiere(visitor);
        return visitor.getCounter();
    }
}