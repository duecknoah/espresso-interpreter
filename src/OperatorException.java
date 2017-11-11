// An exception thrown when an invalid operator is used
public class OperatorException extends ESPException {
    // Parameterless Constructor
    public OperatorException() {}
    
    // Constructor that accepts a message
    public OperatorException(String message)
    {
        super(message);
    }
}
