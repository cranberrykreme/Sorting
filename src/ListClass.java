import java.util.ArrayList;

public class ListClass {

    ArrayList<Integer> list;
    int a = 0;
    

    public ListClass(){
        list = new ArrayList<Integer>();
    }

    public void add(int a, int b, int c){
        list.add(a);
        list.add(b);
        list.add(c);
    }

    public ArrayList<Integer> getList(){
        return list;
    }

}