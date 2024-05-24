package com.peter.demo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoryStudentService implements StudentService {

    private final MemoryStudentDao dao;

    public MemoryStudentService(MemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {

        return dao.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}