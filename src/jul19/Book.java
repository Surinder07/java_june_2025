package jul19;

public class Book {
    //2
    public static void printBookDetails(){
        System.out.println("Inside the static method..");
    }

    public Book() {//4
        System.out.println("Default constructor ");
    }

    { //3
        System.out.println("Instance block");
    }

    static { //1
        System.out.println("Inside the static block...");
    }

    static { //1
        System.out.println("Inside the static block...");
    }

    {

    }

    public void printDetails(){//5
        System.out.println("Dummy output");
    }

}

/*
static context
non static context


 */