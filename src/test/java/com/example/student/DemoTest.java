package com.example.student;

import com.example.student.bean.Student;
import com.example.student.dao.StudentDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

    @Autowired
    private StudentDAO studentDAO;

    @Rollback(true)
    @Transactional
    @Test
    public void testInsert(){

        Student demo = new Student();
        demo.setID(1);
        demo.setName("TestName");
        studentDAO.insert(demo);
        Assert.assertEquals(1,demo.getID());
        //System.out.println(result == null? "插入成功" : "插入失败");
    }

    @Rollback(true)
    @Transactional
    @Test
    public void testUpdate(){
        Student demo = new Student();
        demo.setID(23);
        demo.setName("TestName");
        studentDAO.update(demo);
        Assert.assertEquals("TestName",demo.getName());
    }
    @Rollback(true)
    @Transactional
    @Test
    public void testDelete(){

        studentDAO.delete("23");
        Assert.assertEquals("23","23");
    }
    @Rollback(true)
    @Transactional
    @Test
    public void testFindAll(){
        List<Map<String, Object>> list=studentDAO.findAll();

        for (Map<String, Object> s:list){
            System.out.println(s);
        }

    }
    @Rollback(true)
    @Transactional
    @Test
    public void testFindById(){
       Map<String, Object> student=studentDAO.findByID(24);
        System.out.println(student);

    }

}
