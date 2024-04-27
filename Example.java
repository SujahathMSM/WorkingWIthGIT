class Singleton{
    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
}

class Example{
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        System.out.println(a);

        Singleton b = Singleton.getInstance();
        System.out.println(b);

        Singleton d = Singleton.getInstance();
        System.out.println(d);
    }
}