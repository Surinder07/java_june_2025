package aug16;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box("$^%$^%$^%",10012.23);
        System.out.println(box);
        box.item1 = 10;


        Box box1 = new Box("Coffee","Pen");


        // container

        Container<Integer> container = new Container<>(12,40);

        Container<String> container2 = new Container<>("10040","");


    }
}
