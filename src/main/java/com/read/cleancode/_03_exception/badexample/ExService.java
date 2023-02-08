package com.read.cleancode._03_exception.badexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class ExService {

    private final ExRepository exRepository;

    public ExService(ExRepository exRepository) {
        this.exRepository = exRepository;
    }

    public void checkedTest() throws SQLException {
        exRepository.checkedTest();
    }

    public void uncheckedTest() {
        exRepository.uncheckedTest();
    }

}
