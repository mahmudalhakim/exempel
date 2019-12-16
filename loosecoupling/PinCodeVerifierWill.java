package loosecoupling;

public class PinCodeVerifierWill implements IPinCodeVerifier {
    @Override
    public void verify(String pinCode, String personNr) {
        System.out.println("Verifierar fyrsiffrig kod: " + pinCode + " " + personNr);
    }
}
