package org.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.model.Address;
import org.hibernate.model.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComponentTest {
	private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
     
    @Before
    public void before() {
        Configuration config = new Configuration().configure();// 获取配置对象
        sessionFactory = config.buildSessionFactory();// 创建SessionFactory对象
        session = sessionFactory.openSession();// 创建Session对象
        transaction = session.beginTransaction();// 开启事务
    }
     
    @After
    public void after() {
        transaction.commit();// 提交事务
        session.close();// 关闭Session
        sessionFactory.close();// 关闭SessionFactory
    }
    
    @Test
    public void testComponentSave() {
        Address address = new Address("100000", "18712345678", "北京市");// 创建Address对象
        Student student = new Student("张三", "男", new Date(), address);// 创建Student对象
        session.save(student);// 保存对象
    }
    
    
}
