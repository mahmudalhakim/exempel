package loosecoupling;

public class PinCodeVerifierPavel implements IPinCodeVerifier {
    @Override
    public void verify(String pinCode, String personNr) {
        System.out.println("Verifierar sexsiffrig kod: " + pinCode + " " + personNr);
    }
}
