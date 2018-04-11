package pl.sda.cipher.service;

public interface Cipher {

    String encrypt (String input);
    String decrypt (String input);
    Integer getKey();
}
