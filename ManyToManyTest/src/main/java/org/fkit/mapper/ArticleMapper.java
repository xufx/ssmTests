package org.fkit.mapper;
import org.fkit.domain.Article;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public interface ArticleMapper
{
    Article selectArticleByOrderId(Integer id);
}
