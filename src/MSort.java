import java.util.ArrayList;

public class MSort{
    ArrayList<Integer> list;

    public MSort(ArrayList<Integer> a){
        list = sort(a, a.size());
        System.out.println("sorted list Msort: " + list);
    }


    public ArrayList<Integer> sort(ArrayList<Integer> s, int len){
        if(len < 2){
            return s;
        }

        int mid = len/2;
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        for(int i = 0; i < mid; i++){
            left.add(s.get(i));
        }

        for(int i = mid; i < len; i++){
            right.add(s.get(i));
        }

        sort(left, left.size()); //mid
        sort(right, right.size()); // len-mid

        s = merge(s,left, right, mid, len-mid);

        return s;
    }

    public ArrayList<Integer> merge(ArrayList<Integer> m, ArrayList<Integer> l, ArrayList<Integer> r, int left, int right){
        int i = 0, j = 0, k = 0;

        while(i < left && j < right){
            if(l.get(i) <= r.get(j)){
                m.set(k++, l.get(i++)); //finds k and i, then does calc, then increments
            }
            else{
                m.set(k++, r.get(j++));
            }
        }

        while(i<left){
            m.set(k++, l.get(i++));
        }

        while(j < right){
            m.set(k++, r.get(j++));
        }
        
        return m;
    }
}