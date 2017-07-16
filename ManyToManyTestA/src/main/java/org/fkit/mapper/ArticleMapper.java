package org.fkit.mapper;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Article;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public interface ArticleMapper
{
    @Select("select * from tb_article where id in(select article_id from tb_item where order_id=#{id})")
    List<Article> selectArticleByOrderId(Integer id);
}
