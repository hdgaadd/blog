package constant;

public enum Role {
    ADMIN("adming", "管理员"),
    NORMAL("normal", "普通用户");

    private String val;
    private String message;

    Role(String val, String message) {
        this.val = val;
        this.message = message;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
