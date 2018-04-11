package pl.sda.cipher.helper;

public class ArgsValidator {


    public ArgsValidator() {

    }
    public boolean isValidNumberArgs(String[] args) {
        return args != null & args.length == 4 ;
    }


}
