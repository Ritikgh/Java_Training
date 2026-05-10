interface Storage {
    void upload();
    void download();
}

class GoogleDrive implements Storage {

    public void upload() {
        System.out.println("Uploading to Google Drive");
    }

    public void download() {
        System.out.println("Downloading from Google Drive");
    }
}

class Dropbox implements Storage {

    public void upload() {
        System.out.println("Uploading to Dropbox");
    }

    public void download() {
        System.out.println("Downloading from Dropbox");
    }
}

class Main {
    public static void main(String[] args) {
        Storage s = new GoogleDrive();
        s.upload();
        s.download();

        Storage s2 = new Dropbox();
        s2.upload();
        s2.download();
    }
}