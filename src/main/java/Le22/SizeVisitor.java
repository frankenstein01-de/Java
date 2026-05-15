package Le22;

public class SizeVisitor implements Visitor{
    private int counter = 0;
    @Override
    public void visit(Baum.Knoten current){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}
