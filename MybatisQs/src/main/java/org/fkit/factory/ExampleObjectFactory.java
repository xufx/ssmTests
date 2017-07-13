package org.fkit.factory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.*;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class ExampleObjectFactory extends DefaultObjectFactory
{
    public Object create(Class type)
    {
        return super.create(type);
    }
    /*@Override
    public  Object create(Class type, List<Class> constructorArgTypes, List<Object> constructorArgs)
    {
        return super.create(type, constructorArgTypes, constructorArgs);
    }*/
    @Override
    public void setProperties(Properties properties)
    {
        super.setProperties(properties);
    }
    @Override
    public <T> boolean isCollection(Class<T> type)
    {
        return Collection.class.isAssignableFrom(type);
    }
}
