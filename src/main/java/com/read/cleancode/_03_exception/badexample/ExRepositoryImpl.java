package com.read.cleancode._03_exception.badexample;

import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;

@Repository
public class ExRepositoryImpl implements ExRepository {

    private final DataSource dataSource;
    private final Logger logger;

    public ExRepositoryImpl(DataSource dataSource, Logger logger) {
        this.dataSource = dataSource;
        this.logger = logger;
    }

    /**
     * 하위 계층에서 던지는 체크 익셉션으로 인해 상위 모듈까지 해당 익셉션을 처리해야 함
     */
    @Override
    public void checkedTest() throws SQLException {
         dataSource.getConnection();
    }

    /**
     * 체크 예외를 언체크드 예외로 변환(?)하자..!
     */
    @Override
    public void uncheckedTest() {
       try {
            dataSource.getConnection();
            // 로직
       } catch (SQLException sqlException) {
            throw new RuntimeException("익셉션 발생 !!");
       }
    }


}
