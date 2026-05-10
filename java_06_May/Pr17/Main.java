
interface Printable {

    void print();
}

class PDFDocument implements Printable {

    public void print() {
        System.out.println("Printing PDF Document");
    }
}

class WordDocument implements Printable {

    public void print() {
        System.out.println("Printing Word Document");
    }
}

class Main {

    public static void main(String[] args) {
        Printable p = new PDFDocument();
        p.print();

         Printable p1 = new WordDocument();
        p1.print();
    }
}
