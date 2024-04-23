// i:p: n=5
//o/p: 1 2 3 4 5


public class Print1toN{
static void printNum(int n){
    if(n==1){
        System.out.print(n);
    }
    else{
        printNum(n-1);
        System.out.print(n+ " ");
    }
}

    public static void main(String[] args) {
        int n=1 ;
        printNum(n);
    }
}