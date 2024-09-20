package com.bankdemo.CreatingAccount.hibernate;

import com.bankdemo.CreatingAccount.model.AccountAddrerssEntity;
import com.bankdemo.CreatingAccount.model.AccountEntity;
import com.bankdemo.CreatingAccount.model.AddressEntity;
import com.bankdemo.CreatingAccount.model.AdharEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtils {

    public static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory (){
        if(sessionFactory==null){

            Configuration configuration=new Configuration();

            Properties properties=new Properties();

            properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL,"jdbc:mysql://localhost:3306/bank");
            properties.put(Environment.USER,"root");
            properties.put(Environment.PASS,"root");
            properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
            properties.put(Environment.SHOW_SQL,true);
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(AccountEntity.class)
                    .addAnnotatedClass(AddressEntity.class)
                    .addAnnotatedClass(AccountAddrerssEntity.class)
                    .addAnnotatedClass(AdharEntity.class);

           // ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(registry);
        }
        return sessionFactory;
    }

}
