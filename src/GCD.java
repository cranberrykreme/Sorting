public class GCD{

    int a;
    int b;

    public GCD(int big, int small){
        a = big;
        b = small;
    }

    public int getGCD(){
        int temp= 0;
        while(b != 0){
            if(a%b == 0){
                return b;
            }
            else{
                temp = a;
                a = b;
                b = temp%b; 
            }
        }
        return -1;
    }
}