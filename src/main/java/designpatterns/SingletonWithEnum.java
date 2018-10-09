package designpatterns;

public enum SingletonWithEnum {

    INSTANCE;

    private int count;

    public void increaseCount() { count++; }

    public void printCount() { System.out.println("count=" + count); }

    SingletonWithEnum() {
        System.out.println("initialization");
    }

}
