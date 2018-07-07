package com.stone.jobhunter.test.servicetest;


public interface BaseServiceTest<T> {

    void add();

    void update();

    void select();

    void delete();

    void selectCount();

    void selectById();
}
