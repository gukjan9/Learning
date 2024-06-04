class SingletonInstance {
    private static class singleInstanceHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}

public class Singleton {
    public static void main(String[] args){
        Singleton a = SingletonInstance.getInstance();
        Singleton b = SingletonInstance.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if (a == b){
            System.out.println(true);
        }
    }
}
