interface Mango {
    void taste();
}

// Winter class
class Winter implements Mango {
    public void taste() {
        System.out.println("Mango in Winter: Not available / Stored mango taste.");
    }
}

// Summer class
class Summer implements Mango {
    public void taste() {
        System.out.println("Mango in Summer: Sweet and juicy!");
    }
}

// Driver class
class Main {
    public static void main(String[] args) {
        Mango w = new Winter();
        Mango s = new Summer();

        w.taste();
        s.taste();
    }
}