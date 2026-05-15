package Klasurvorbereitung.AufgabeBaumVisitor;

public class SizeVisitor implements Visitor{
    private int count=0;

    public void visit(Baum.Knoten current){
        count++;
    }
    public int getCount(){
        return count;
    }
}
