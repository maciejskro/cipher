package pl.sda.cipher.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AESCipherTest {

    private Cipher aESCipher;
    private String key;

    @Before
    public void setUp() {
        this.key = "lsJdlkfsMB244vDa";
        this.aESCipher = new AESCipher(key);
    }

    @Test
    public void testEncrypt() throws Exception {
        String result = aESCipher.encrypt("input");
        System.out.println(this.key.toCharArray()  + " length " + key.toCharArray().length);
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    public void testDecrypt() throws Exception {
        String result = aESCipher.decrypt("input");
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    public void testGetKey() throws Exception {
        Integer result = aESCipher.getKey();
        Assert.assertEquals(Integer.valueOf(0), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme