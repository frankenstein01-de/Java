package Generic;

import java.util.ArrayList;

public class GenericStack<T> implements StackInter<T> {
    private ArrayList<T> list;
    public GenericStack(){
        this.list=new ArrayList<T>();
    }

    @Override
    public void push(T element){
        this.list.add(element);
    }
    @Override
    public T pop(){
        if(this.list.isEmpty()){
            return null;
        }
        int lastIndex = this.list.size() - 1;
        return this.list.remove(lastIndex);
    }
    @Override
    public int size(){
        return this.list.size();
    }
    public static void main(String[] args) {
        GenericStack<String> s = new GenericStack<>();
        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
