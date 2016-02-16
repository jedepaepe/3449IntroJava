package eu.epfc.cours3449.l19.Biblio;

/**
 * BusinessException are exception that must be managed by the business
 */
public class BusinessException extends Exception {

    public BusinessException(String message) {
        super(message);
    }
    
}
