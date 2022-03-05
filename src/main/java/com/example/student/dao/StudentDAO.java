package com.example.student.dao;
import com.example.student.bean.*;

import java.util.*;
public interface StudentDAO{
    public void insert(Student s);
    public void update(Student s);
    public void delete(String iD);
    public Map<String, Object> findByID(long id);
    public List<Map<String, Object>> findAll();
} 

