package org.fkit.domain;
/**
 * Created by xufuxiu on 2017/7/16.
 */
public class Card
{
    private Integer id;
    private String code;
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
    @Override
    public String toString()
    {
        return "Card{id="+id+",code="+code+"}";
    }
}
