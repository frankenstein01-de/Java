package inheritance;

public class ArrayList {
    int size;
    int[] array;
    public ArrayList(){
        this.array=new int[10];
        this.size=0;
    }
    public void setSize(int a){
        this.size=a;
    }
    public int getSize(){
        return size;
    }
    public boolean add(int a){
        boolean geklappt=false;
        if(array.length>size){
            array[size]=a;
            setSize(size+1);
            geklappt=true;
        }
        return geklappt;
    }


    public int remove(int index){
        if(index<0||index>=getSize()){
            throw new IndexOutOfBoundsException("Ungültiger index:"+index+" die aktuelle Größe ist "+getSize());
        }
        int removed = array[index];
        for(int i=index;i<size-1;i++){
            array[i]=array[i+1];

        }
        setSize(size-1);
        return removed;


    }

}
