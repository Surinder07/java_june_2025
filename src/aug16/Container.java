package aug16;

public class Container<K> {
    K item1;
    K item2;

    public Container(K item1, K item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public K run(){
        return item1;
    }

    @Override
    public String toString() {
        return "Container{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }
}
