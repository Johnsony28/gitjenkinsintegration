public class bit {
    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            // even number
            System.out.println("even number");
        } else {
            System.out.println("odd number ");
        }
    }
public static int getithbit(int n, int i){
    int bitmask =  1<<i;
    if((n&bitmask)==0){
        return 0;
    }else{
        return 1;
    }
}
public static int setithbit(int n, int i){
    int bitmask = 1<<i;
    return n|bitmask;
}
public static int clearithbit(int n, int i ){
int bitmask = ~(1<<i);
    return n & bitmask;
}
public static int updateithbit(int n, int i, int newbit){
    if (newbit==0){
        return clearithbit(n, newbit);
    }else{
        return setithbit(n, newbit);
    }
}
    public static void main(String[] args) {
        // oddoreven(8);
        // oddoreven(7);
       System.out.println( updateithbit(10, 1,1));
    }
}
