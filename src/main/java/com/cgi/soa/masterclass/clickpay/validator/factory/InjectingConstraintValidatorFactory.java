package com.cgi.soa.masterclass.clickpay.validator.factory;

import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.util.AnnotationLiteral;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InjectingConstraintValidatorFactory  {

	public static <T extends Object> T getInstance(Class<T> type) {
		try {
			T t = getBeanInstance(type);
			if (t == null) {
				t = type.newInstance();
			}
			return t;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static BeanManager getBeanManager() throws NamingException {
		String name = "java:comp/" + BeanManager.class.getSimpleName();
		InitialContext ic = new InitialContext();
		BeanManager beanManager = (BeanManager) ic.lookup(name);
		return beanManager;
	}

	@SuppressWarnings("unchecked")
	private static <T> T getBeanInstance(final Class<T> type) throws Exception {
		BeanManager beanManager = getBeanManager();

        final Set<Bean<?>> beans = beanManager.getBeans(Object.class,new AnnotationLiteral<Any>() {

			private static final long serialVersionUID = 3612602223649004820L;});
        
        for (Bean<?> iterateBean : beans) {
            if(iterateBean.getBeanClass().getName() == type.getName()){
            	Bean<T> bean = (Bean<T>) iterateBean;
                final CreationalContext<T> creationalContext = beanManager.createCreationalContext(bean);
                return (T) beanManager.getReference(bean, type,creationalContext);
            }
        }
        return null;
	}

}
