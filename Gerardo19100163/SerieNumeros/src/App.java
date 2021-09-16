public class App {
    public static void main(String[] args) throws Exception {
        int a=1;
        int b=2;
        int c=10;
        int iterador=1;
        int s=0;
        System.out.println(a);
        System.out.println(b);
        while(iterador<=c){
            s=a+b;
            System.out.println(s);

            a=b;
            b=s;
            iterador++;
        }
    }
}
