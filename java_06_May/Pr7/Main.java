abstract class Character {
    abstract void attack();
    abstract void defend();
}

class Warrior extends Character {
    void attack() {
        System.out.println("Warrior attacks with sword");
    }

    void defend() {
        System.out.println("Warrior blocks with shield");
    }
}

class Mage extends Character {
    void attack() {
        System.out.println("Mage attacks using magic");
    }

    void defend() {
        System.out.println("Mage creates magic shield");
    }
}

class Archer extends Character {
    void attack() {
        System.out.println("Archer attacks using arrows");
    }

    void defend() {
        System.out.println("Archer dodges attack");
    }
}

class Main {
    public static void main(String[] args) {
        Character c = new Warrior();
        c.attack();
        c.defend();

        Character c2 = new Mage();
        c2.attack();
        c2.defend();

        Character c3 = new Archer();
        c3.attack();
        c3.defend();
    }
}