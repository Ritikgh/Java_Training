
abstract class Doctor {

    abstract void treatPatient();
}

class Surgeon extends Doctor {

    void treatPatient() {
        System.out.println("Surgeon performs surgery");
    }
}

class Dentist extends Doctor {

    void treatPatient() {
        System.out.println("Dentist treats teeth");
    }
}

class Main {

    public static void main(String[] args) {
        Doctor d1 = new Surgeon();
        d1.treatPatient();

        Doctor d2 = new Dentist();
        d2.treatPatient();
    }
}
