package org.fkit.domain;
import java.io.Serializable;
import java.util.List;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public class User implements Serializable
{
    private Integer id;
    private String username;
    private String loginname;
    private String password;
    private String phone;
    private String address;
    private List<Order> orders;//一个用户对应多个订单
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
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
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public List<Order> getOrders()
    {
        return orders;
    }
    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }
    @Override
    public String toString()
    {
        return "User{id="+id+",username="+username+",loginname="+loginname+",password="+password+",phone="+phone+",address="+address+"}";
    }
}
