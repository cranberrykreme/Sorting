import java.util.ArrayList;
/**
 * the slowest type of sorting
 * Bubble sort
 * uses two loops to sort in O(n^2) time
 */
public class BSort {

    ArrayList<Integer> list;
    
    public BSort(ArrayList<Integer> a){
        list = sort(a);
        System.out.println("sorted list Bsort: " + list);
    }

    public ArrayList<Integer> sort(ArrayList<Integer> s){
        for(int i = 0; i < s.size()- 1; i++){
            for(int j = 0; j < s.size()-1 - i; j++){
                if(s.get(j) > s.get(j+1)){
                    int temp = s.get(j);
                    s.set(j, s.get(j+1));
                    s.set(j+1, temp);
                    
                }
            }
        }
        return s;
    }
}