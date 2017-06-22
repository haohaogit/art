package cn.art.model;

public class User {
    private Integer uid;

    private String uname;

    private String upassword;

    private Byte uprivilege;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public Byte getUprivilege() {
        return uprivilege;
    }

    public void setUprivilege(Byte uprivilege) {
        this.uprivilege = uprivilege;
    }
}