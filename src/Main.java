import java.util.ArrayList;
import java.util.Random;


public class Main {

    private static Random rand = new Random();
    GCD gcd;
    ListClass list;
    ArrayList<Integer> sortMe = new ArrayList<Integer>();
    BSort b;
    MSort m;
    QSort q;
    ArrayList<Integer> searchMe = new ArrayList<Integer>();
    BSearch binary;
    IsSorted s;

    public static void main (String[] args){
        new Main();
    }

    public Main(){
        int a = findDenominator(5053240,543288);
        System.out.println("GCD is " + a);
        ArrayList<Integer> alist = changeList(1,2,3);
        System.out.println("ArrayList is: " + alist);
        makeList();
        System.out.println("unsorted list: " + sortMe);
        s = new IsSorted(sortMe);
        b = new BSort(sortMe);
        m = new MSort(sortMe);
        q = new QSort(sortMe);
        searchMe = q.sorting(sortMe, 0, sortMe.size() - 1);
        s = new IsSorted(searchMe);
        binary = new BSearch(searchMe);
    }

    public int findDenominator(int a, int b){
        gcd = new GCD(a, b);
        int answer = gcd.getGCD();
        return answer;
    }

    public ArrayList<Integer> changeList(int a,int b, int c){
        list = new ListClass();
        list.add(a,b,c);
        return list.getList();
    }

    public ArrayList<Integer> makeList(){
        for(int i = 0; i<15; i++){
            sortMe.add(rand.nextInt(100));
        }
        if(!sortMe.contains(50)){
            sortMe.add(50);
        }
        return sortMe;
    }
}