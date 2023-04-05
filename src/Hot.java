public class Hot {
    void hot( int a,int s){
        System.out.println(a*s);

    }
    void hot( int d, float c){
        System.out.println(d+ c);
    }
    void hot (byte e ,int d){
        System.out.println(e -d);
    }


    public static void main(String[] args) {
        Hot h = new Hot();
        h.hot(234,345);
        h. hot(2245,345f );
        h.hot(1,23);
    }
}
