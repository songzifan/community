package life.majiang.community.exception;

/**
 * Created by Kiss on 2019/9/9 0009.
 */
public class CustomizeException extends RuntimeException{
    private String message;
    private Integer code;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return getMessage();
    }

    public Integer getCode() {
        return code;
    }
}
