package com.juaracoding.utils;

public enum TestCases {
    T1("Login Valid Test"),
    T2("Login Invalid Test"),
    T3("Add New Vacancies");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
