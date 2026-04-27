abstract class AbstractProduct {
    int product_id;

    AbstractProduct(int id) {
        product_id = id;
    }

    abstract void display();
}

class Book extends AbstractProduct {
    String title;

    Book(int id, String t) {
        super(id);
        title = t;
    }

    void display() {
        System.out.println("Book ID: " + product_id + " Title: " + title);
    }
}

class CD extends AbstractProduct {
    String artist;

    CD(int id, String a) {
        super(id);
        artist = a;
    }

    void display() {
        System.out.println("CD ID: " + product_id + " Artist: " + artist);
    }
}

class MainA4 {
    public static void main(String[] args) {
        AbstractProduct p;

        p = new Book(1, "Travel Guide");
        p.display();

        p = new CD(2, "Music Album");
        p.display();
    }
}