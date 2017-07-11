package org.fkit.domain;
/**用于接收jsp页面传入的json数据
 * Created by xufuxiu on 2017/7/11.
 */
public class Book
{
    private Integer id;
    private String name;
    private String author;
    public Book()
    {
        super();
    }
    public Book(Integer id, String name, String author)
    {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }
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
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    @Override
    public String toString()
    {
        return "Book{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }
}
