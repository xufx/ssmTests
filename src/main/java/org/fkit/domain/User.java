package org.fkit.domain;
import java.io.Serializable;
/**User是一个域对象，用来接收并封装前台页面传递过来的数据
 * Created by xufuxiu on 2017/7/9.
 */
public class User implements Serializable
{
    private String loginname;
    private String password;
    private String username;
    public User()
    {//公共构造器
        super();
    }
    public User(String loginname, String password, String username)
    {
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
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return username;
    }
}
