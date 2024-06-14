import facade.VideoConversionFacade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Facade Pattern...\n");

        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("mydemovideo.mp4", "ogg");
    }
}