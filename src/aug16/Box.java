package aug16;

public class Box {
    Object item1;
    Object item2;

    public Box(Object item1, Object item2) {
        this.item1 = item1;
        this.item2 = item2;
    }


    @Override
    public String toString() {
        return "Box{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }
}
