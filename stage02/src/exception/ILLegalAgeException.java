package exception;

public class ILLegalAgeException extends Exception {

    public ILLegalAgeException() {
        super();
    }

    public ILLegalAgeException(String message) {
        super(message);
    }

    public ILLegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ILLegalAgeException(Throwable cause) {
        super(cause);
    }

    protected ILLegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
