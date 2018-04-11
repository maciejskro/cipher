package pl.sda.cipher.service;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class CesarCipherTest {

    private Cipher cesarCipher;
    private String toEncode = "eszkerberzker";
    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Before
    public void setUp() {
        Integer key = 16;
        cesarCipher = new CesarCipher(key);
    }
    @Test
    public void testEncrypt() throws Exception {
        String input = "input";
        String result = cesarCipher.encrypt(input);

        Assert.assertEquals("y~\u0080\u0085\u0084", result);
    }

    @Test
    public void testDecrypt() throws Exception {
        String input = "y~\u0080\u0085\u0084";
        String result = cesarCipher.decrypt(input);

        Assert.assertEquals("input", result);
    }

    @Test
    public void testEncryptDecrypt() throws  Exception {

        String result = cesarCipher.encrypt(toEncode);
        String result2 = cesarCipher.decrypt(result);

        assertThat(result2).isEqualTo(toEncode);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIfKeyIsMaxCharacter() {
        CesarCipher cipher = new CesarCipher((int) Character.MAX_VALUE);

        assertThat(cipher.getKey()).isEqualTo(0);
        assertThat(cipher.encrypt(toEncode)).isEqualTo(toEncode);

    }

    @Test
    public  void testIfKeyIsBiggerThanMaxCharacter() {
        CesarCipher cipher = new CesarCipher((int) Character.MAX_VALUE + 2);
        CesarCipher cipher1 = new CesarCipher(2);

       assertThat(cipher.encrypt(toEncode)).isEqualTo(cipher1.encrypt(toEncode));
    }
}