package org.fkit.domain;
/**
 * Created by xufuxiu on 2017/7/14.
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
        return "[id="+id+",code="+code+"]";
    }
}
