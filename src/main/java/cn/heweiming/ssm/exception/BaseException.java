package cn.heweiming.ssm.exception;

/**
 * @author heweiming  2017年9月23日 下午5:16:56
 * @version 1.0.0
 * @description 
 */
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
