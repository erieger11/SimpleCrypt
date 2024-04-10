import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileReaderTest {
    Path path;
    String fileContents;

    @Before
    public void FileSource() throws IOException {
        path = Path.of("/Users/ethan/Desktop/Projects/SimpleCrypt/sonnet18.txt");
        fileContents = Files.readString(path);
    }

    @Test
    public void ROT13FileEncryptTest() throws IOException {
        Path pathWritten = Path.of("/Users/ethan/Desktop/Projects/SimpleCrypt/sonnetROT13.txt");
        ROT13 rot13 = new ROT13();
        String output = rot13.crypt(fileContents);
        Files.writeString(pathWritten,output);
    }
    @Test
    public void ROT13FileDecryptTest() throws IOException {
        Path encryptedPath = Path.of("/Users/ethan/Desktop/Projects/SimpleCrypt/sonnetROT13.txt");
        ROT13 rot13 = new ROT13();
        String encryptedFileContents = Files.readString(encryptedPath);
        String output = rot13.crypt(encryptedFileContents);
        Assert.assertEquals(output,fileContents);
    }
    @Test
    public void TATAFileEncryptTest() throws IOException {
        Path pathWritten = Path.of("/Users/ethan/Desktop/Projects/SimpleCrypt/sonnetTATA.txt");
        EthansCrypt tata = new EthansCrypt();
        String output = tata.encryptToTATA(fileContents);
        Files.writeString(pathWritten,output);

    }
    @Test
    public void TATAFileDecryptTest() throws IOException {
        Path encryptedPath = Path.of("/Users/ethan/Desktop/Projects/SimpleCrypt/sonnetTATA.txt");
        EthansCrypt tata = new EthansCrypt();
        String encryptedFileContents = Files.readString(encryptedPath);
        String output = tata.decryptTATA(encryptedFileContents);
        Assert.assertEquals(output, fileContents);
    }
}
