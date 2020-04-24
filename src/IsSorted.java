import java.util.ArrayList;

public class IsSorted{
    public IsSorted(ArrayList<Integer> a){
        boolean sorted = false;

        sorted = amISorted(a, a.size()-1);

        System.out.println("Am I sorted? " + sorted);
    }

    public boolean amISorted(ArrayList<Integer> list, int size){

        if(size < 2){
            return true;
        } else if(list.get(size - 2).compareTo(list.get(size - 1)) > 0){
            return false;
        } else {
            return amISorted(list, size - 1);
        }
        
    }
}