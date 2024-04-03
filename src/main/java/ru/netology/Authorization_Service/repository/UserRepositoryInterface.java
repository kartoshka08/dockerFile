package ru.netology.Authorization_Service.repository;

import ru.netology.Authorization_Service.model.Authorities;

import java.util.List;

public interface UserRepositoryInterface {
    public List<Authorities> getUserAuthorities(String user, String password);
}