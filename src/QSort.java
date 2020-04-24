import java.util.ArrayList;

public class QSort{

    ArrayList<Integer> list = new ArrayList<Integer>();

    public QSort(ArrayList<Integer> sort){
        list = sorting(sort, 0, sort.size() - 1);

        System.out.println("sorted list Qsort: " + list);
    }


    public ArrayList<Integer> sorting(ArrayList<Integer> l, int start, int finish){
        if(start < finish){
            int partitionIndex = partition(l, start, finish);

            sorting(l, start, partitionIndex -1); //left side
            sorting(l, partitionIndex + 1, finish); //right side
        }

        return l;
    }

    private int partition(ArrayList<Integer> list, int begin, int end){
        int pivot = list.get(end);

        int i = begin - 1;

        for(int j = begin; j < end; j++){
            if(list.get(j) <= pivot){
                i++;

                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(i+1);
        list.set(i+1, list.get(end));
        list.set(end, temp);

        return i + 1;
    }
}