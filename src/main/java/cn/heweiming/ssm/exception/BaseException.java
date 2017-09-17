package cn.heweiming.ssm.exception;

public abstract class BaseException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected String errorCode;
    protected String message;

    public BaseException(String errorCode, String message) {
        super();
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
