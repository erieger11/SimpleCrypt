import org.junit.Assert;
import org.junit.Test;
public class EthansCryptTest {
    @Test
    public void tataTest() {
        // Given
        String s1 = "Howdy";
        String s2 = "TEH-TO-TUW-TAD-TUY-";

        // When
        EthansCrypt tata = new EthansCrypt();
        String actual = tata.encryptToTATA(s1);

        // Then
        Assert.assertEquals(s2, actual);
    }

        @Test
        public void tataDecryptTest() {
            // Given
            String s1 = "TEH-TO-TUW-TAD-TUY-";
            String s2 = "howdy";

            // When
            EthansCrypt tata = new EthansCrypt();
            String actual = tata.decryptTATA(s1);

            // Then
            Assert.assertEquals(s2, actual);
        }


    }