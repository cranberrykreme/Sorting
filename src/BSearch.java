import java.util.ArrayList;

/**
 * uses binary search to find a number
 * in a sorted ArrayList
 */
public class BSearch{

    public BSearch(ArrayList<Integer> a){
        int iterative = iSearch(a, 50, 0, a.size()-1);
        int recursive = rSearch(a, 50, 0, a.size()-1);

        System.out.println("searched list iSearch: " + iterative);
        System.out.println("searched list rSearch: " + recursive);
    }

    /**
     * 
     * Uses iterative search
     */
    public int iSearch(ArrayList<Integer> list, int key, int low, int high){
        int index = -1;

        while (low <= high){
            int mid = (low + high)/2;
            if(list.get(mid) < key){
                low = mid + 1;
            } else if(list.get(mid) > key){
                high = mid - 1;
            } else if(list.get(mid) == key){
                index = mid;
                return index;
            }
        }

        return index;
    }

    /**
     * uses recursive search
     */
    public int rSearch(ArrayList<Integer> list, int key, int low, int high){
        int mid = (high + low)/2;

        if(high < low){
            return -1;
        }

        if(list.get(mid) == key){
            return mid;
        } else if(list.get(mid) <  key){
            return rSearch(list, key, mid+1, high);
        } else if(list.get(mid) > key){
            return rSearch(list, key, low, mid-1);
        }

        return -1;
    }
}