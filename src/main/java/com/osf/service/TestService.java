package com.osf.service;

import com.osf.model.Test;
import com.osf.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestService{

    @Autowired
    public TestRepository testRepository;

    public Optional<Test> findTestById(Long id) {
        return testRepository.findById(id);
    }

    public Page<Test> findAllTest(Pageable pageable) {
        return testRepository.findAll(pageable);
    }

    public Test saveTest(Test test) {
        return testRepository.save(test);
    }
}
