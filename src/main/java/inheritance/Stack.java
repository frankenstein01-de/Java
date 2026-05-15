package inheritance;



public class Stack implements StackInter{
    private ArrayList list;
    public Stack(){
        this.list= new ArrayList();
    }
    @Override
    public void push(int a){
        this.list.add(a);
    }
    @Override
    public int pop() {
        if (this.list.getSize() == 0) {
            throw new RuntimeException("Der Stack ist Leer");
        }
        int lastIndex = this.list.getSize() - 1;
        return this.list.remove(lastIndex);
    }
    @Override
    public int size() {
        return this.list.getSize();
    }
}



