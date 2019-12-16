package loosecoupling;

public class Main {
    public static void main(String[] args) {

        IPinCodeVerifier pavelVerifier = new PinCodeVerifierPavel();
        IPinCodeVerifier willVerifier = new PinCodeVerifierWill();

        Bankomat bankomat2 = new Bankomat(pavelVerifier);
        Bankomat bankomat = new Bankomat(willVerifier);
        bankomat.verify("1332","121212-1212");
        bankomat2.verify("123456","000000-0000");
    }
}
