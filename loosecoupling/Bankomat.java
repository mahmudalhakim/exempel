package loosecoupling;

import java.util.List;

public class Bankomat {
    private final IPinCodeVerifier verifier;

    public Bankomat(IPinCodeVerifier verifier){
        this.verifier = verifier;
    }

    public void verify(String pinCode, String personNr){

        this.verifier.verify(pinCode,personNr);
    }


}
