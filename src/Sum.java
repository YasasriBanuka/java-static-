public class Sum {
    void sum( int a , long b){
        System.out.println(a+b);
    }
    void sum (int s,int q){
        System.out.println(s+q);
    }
    public static void main(String[] args) {
        Sum s= new Sum();
        s.sum ( 5,12345678L);
        s.sum(23,344);
    }
}
