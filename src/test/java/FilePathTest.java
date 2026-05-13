import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilePathTest {

    @Test
    public void testFilePathHandling_Refactored() {
        String directory = "src";
        String filename = "config.xml";
        String systemPath = new File(directory, filename).getPath();

        // Cách 1: Tái cấu trúc dùng File.separator (Cách cổ điển)
        String refactoredPath1 = directory + File.separator + filename;
        assertEquals(systemPath, refactoredPath1, "Cach 1 that bai!");

        // Cách 2: Tái cấu trúc dùng API java.nio.file.Path
        Path refactoredPath2 = Paths.get(directory, filename);
        assertEquals(systemPath, refactoredPath2.toString(), "Cach 2 that bai!");
    }

}

