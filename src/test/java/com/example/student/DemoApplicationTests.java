package com.example.student;

import com.example.student.bean.Student;
import com.example.student.dao.StudentDAO;
import com.example.student.daoIMP.StudentDAOIMP;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@SpringBootApplication
public class DemoApplicationTests{

    @Test
    public void contextLoads() {
    }

}
