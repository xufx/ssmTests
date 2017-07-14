package org.fkit.mapper;
import org.fkit.domain.Person;
/**
 * Created by xufuxiu on 2017/7/14.
 */
public interface PersonMapper
{
    Person selectPersonById(Integer id);
}
