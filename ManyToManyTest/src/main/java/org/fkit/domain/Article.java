package org.fkit.domain;
import java.io.Serializable;
import java.util.List;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public class Article implements Serializable
{
    private Integer id;
    private String name;
    private Double price;
    private String remark;
    private List<Order> orders;//一个商品对应多个订单
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Double getPrice()
    {
        return price;
    }
    public void setPrice(Double price)
    {
        this.price = price;
    }
    public String getRemark()
    {
        return remark;
    }
    public void setRemark(String remark)
    {
        this.remark = remark;
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
        return "Article{id="+id+",name="+name+",price="+price+",remark="+remark+"}";
    }
}