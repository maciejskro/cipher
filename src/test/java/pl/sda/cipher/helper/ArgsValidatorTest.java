package pl.sda.cipher.helper;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArgsValidatorTest {

    @Test
    public void testIsValidNumberOfArgsIsGiven() {
        String[] arg = {"list" , "test" , "nowy", "cesar"};
        ArgsValidator validator = new ArgsValidator();
        validator.isValidNumberArgs(arg);

        assertThat(validator.isValidNumberArgs(arg)).isTrue();
    }
}
