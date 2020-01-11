package ru.yakstar.loginformmvp.model;

interface UserResult {
    String getEmail();
    String getPassword();
    int isValidData();
}
