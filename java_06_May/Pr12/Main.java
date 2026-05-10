interface Camera {
    void clickPhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    public void clickPhoto() {
        System.out.println("Photo Clicked");
    }

    public void playMusic() {
        System.out.println("Music Playing");
    }
}

class Main {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.clickPhoto();
        s.playMusic();
    }
}