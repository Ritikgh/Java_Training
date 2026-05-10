abstract class FileProcessor {
    abstract void processFile();
}

class TextFile extends FileProcessor {
    void processFile() {
        System.out.println("Processing Text File");
    }
}

class ImageFile extends FileProcessor {
    void processFile() {
        System.out.println("Processing Image File");
    }
}

class VideoFile extends FileProcessor {
    void processFile() {
        System.out.println("Processing Video File");
    }
}

class Main {
    public static void main(String[] args) {
        FileProcessor f1 = new TextFile();
        f1.processFile();

        FileProcessor f2 = new ImageFile();
        f2.processFile();

        FileProcessor f3 = new VideoFile();
        f3.processFile();
    }
}