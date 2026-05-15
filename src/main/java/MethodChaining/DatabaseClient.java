package MethodChaining;

public class DatabaseClient implements IConnectStep,ITableStep,IDataStep {
    private String url;
    private String tableName;
    private DatabaseClient(){}

    public static IConnectStep go(){
        return new DatabaseClient();
    }
    @Override
    public ITableStep connect(String url){
        this.url=url;
        return this;
    }
    @Override
    public IDataStep selectTabel(String tableName){
        this.tableName=tableName;
        return this;
    }
    @Override
    public void fetchData(){
        System.out.println("Der Datenbaseclient verbindet sich mit der Url: "+url+" mit der Table mit dem Namen: "+tableName);
    }
    public static void main(String[]args){
        DatabaseClient.go().connect("https:www.database.com").selectTabel("Exmatrikulieren ist einfacher").fetchData();
    }
}
