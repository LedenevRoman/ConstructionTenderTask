package ConstructionTender;

public class TenderFailedException extends RuntimeException{

    public TenderFailedException() {
    }

    public TenderFailedException(String message) {
        super(message);
    }
}
