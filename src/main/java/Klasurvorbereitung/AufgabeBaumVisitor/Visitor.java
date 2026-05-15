package Klasurvorbereitung.AufgabeBaumVisitor;

public interface Visitor<T> {
    public void visit(Baum.Knoten current);
}

