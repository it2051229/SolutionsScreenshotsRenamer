
import java.io.File;

public class ScreenshotRenamer {

    // Entry point of the program
    public static void main(String[] args) throws Exception {
        // Rename the images that ends with a .png
        File currentDirectory = new File("./");
        int nextScreenShotNumber = 1;

        for (File file : currentDirectory.listFiles()) {
            if (file.isFile()) {
                String filename = file.getName().toLowerCase();

                // Entertain only PNG files
                if (filename.endsWith(".png")) {
                    // Ignore figures
                    if (!filename.contains("figure")) {
                        file.renameTo(new File("screenshot" + nextScreenShotNumber + ".png"));
                        nextScreenShotNumber++;
                    }
                }
            }
        }
    }
}
