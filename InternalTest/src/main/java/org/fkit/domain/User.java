package org.fkit.domain;
/**
 * Created by xufuxiu on 2017/7/11.
 */
public class User
{
    private String loginname;
    private String password;
    private String username;
    public User()
    {
        super();
    }
    public User(String loginname, String password, String username)
    {
        super();
        this.loginname = loginname;
        this.password = password;
        this.username = username;
    }
    public String getLoginname()
    {
        return loginname;
    }
    public void setLoginname(String loginname)
    {
        this.loginname = loginname;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
}
