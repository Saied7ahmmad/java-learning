public class House {
    public int window;
    public int  door ;// instance var
    public void incrisedr(int dr, int win ){
        window = window + win;
        door = door + dr;
    }

    public void view(){
        System.out.println(window + " windows " );
        System.out.println(door + " doors " );
    }
    public static void main(String[] args) {
        House h1 =new House();
    h1.window = 6;
    h1.door = 5;
    House h2 = new House();
    h2.window = 7;
    h2.door = 9;
    System.out.println("h1 =======");
    h1.view();
    h1.incrisedr(5, 6);

    System.out.println("h2=====");
    h2.view();
    h2.incrisedr(8, 5);
    System.out.println("h1 =======");
    h1.view();

    System.out.println("h2=====");
    h2.view();

    }

}
