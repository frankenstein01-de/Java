package Le22;

public interface Visitor<T>
{
    public void visit(Baum.Knoten<T> current);
}

