package pl.sda.cipher;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import pl.sda.cipher.service.Cipher;

public class MainTest {

    @Mock
    Main main;
    @Mock
    Cipher cipher;

    @Test
    public void testMain() throws Exception {
        Main.main(new String[]{"args"});
        Mockito.mock(Main.class);
        Mockito.mock(Cipher.class);
    }

    @Test
    public void testCallWithLessOrMoreParams() {


    }

    @Test
    public void testReadFileFromParam() {

    }

    @Test
    public  void testSaveFileGivenAsParam() {

    }
    @Test
    public void testCallInterfaceEncryptMethod() {

    }

    @Test
    public void testCallInterfaceDecryptMethod() {

    }
}