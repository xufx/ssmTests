package org.fkit.domain;
import java.io.Serializable;
import java.util.List;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public class Order implements Serializable
{
    private Integer id;
    private String code;
    private Double total;
    private User user;//一个订单对应一个用户,一个用户对应多个订单，多对一
    private List<Article>articles;//一个订单包含多个商品，一个商品对应多个订单，多对多
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getCode()
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    public Double getTotal()
    {
        return total;
    }
    public void setTotal(Double total)
    {
        this.total = total;
    }
    public User getUser()
    {
        return user;
    }
    public void setUser(User user)
    {
        this.user = user;
    }
    public List<Article> getArticles()
    {
        return articles;
    }
    public void setArticles(List<Article> articles)
    {
        this.articles = articles;
    }
    @Override
    public String toString()
    {
        return "Order{id="+id+",code="+code+",total="+total+"}";
    }
}
