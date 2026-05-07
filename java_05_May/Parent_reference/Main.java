class Game {

    void play() {
        System.out.println("Playing a game");
    }
}

class Cricket extends Game {

    @Override
    void play() {
        System.out.println("Playing Cricket");
    }
}

class Football extends Game {

    @Override
    void play() {
        System.out.println("Playing Football");
    }
}

class Hockey extends Game {

    @Override
    void play() {
        System.out.println("Playing Hockey");
    }
}

public class Main {

    public static void main(String[] args) {

        Game g;

        g = new Cricket();
        g.play();

        g = new Football();
        g.play();

        g = new Hockey();
        g.play();
    }
}