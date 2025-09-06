package sep6;


class Building {

    static class Rooms {
        public void show(){
            System.out.println("Inside the static inner class ");
        }
    }
}


public class StaticDemo {
    public static void main(String[] args) {
        Building.Rooms rooms = new Building.Rooms();
        rooms.show();
    }
}
