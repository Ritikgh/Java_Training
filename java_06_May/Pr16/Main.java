interface FileOperation {
    void read();
    void write();
}

class TextFile implements FileOperation {

    public void read() {
        System.out.println("Reading Text File");
    }

    public void write() {
        System.out.println("Writing Text File");
    }
}

class BinaryFile implements FileOperation {

    public void read() {
        System.out.println("Reading Binary File");
    }

    public void write() {
        System.out.println("Writing Binary File");
    }
}

class Main {
    public static void main(String[] args) {
        FileOperation f = new TextFile();
        f.read();
        f.write();

        FileOperation f2 = new BinaryFile();
        f2.read();  
        f2.write();
    }
}