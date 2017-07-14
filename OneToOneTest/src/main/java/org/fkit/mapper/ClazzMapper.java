package org.fkit.mapper;
import org.fkit.domain.Clazz;
/**
 * Created by xufuxiu on 2017/7/14.
 */
public interface ClazzMapper
{
    Clazz selectClazzById(Integer id);
}
/*调用此方法时会执行 ClazzMapper中id=selectClazzById的语句*/