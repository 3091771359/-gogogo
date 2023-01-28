package studentsystem;

public class User {
    //#### 用户类：
    //	属性：用户名、密码、身份证号码、手机号码
    private String username;
    private String password;
    private String personid;
    private String phonenumber;


    public User() {
    }

    public User(String username, String password, String personid, String phonenumber) {
        this.username = username;
        this.password = password;
        this.personid = personid;
        this.phonenumber = phonenumber;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return personid
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * 设置
     * @param personid
     */
    public void setPersonid(String personid) {
        this.personid = personid;
    }

    /**
     * 获取
     * @return phonenumber
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置
     * @param phonenumber
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
