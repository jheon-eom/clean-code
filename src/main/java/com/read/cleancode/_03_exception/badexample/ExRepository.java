package com.read.cleancode._03_exception.badexample;

import java.sql.SQLException;

public interface ExRepository {

    void checkedTest() throws SQLException;
    void uncheckedTest();
}
