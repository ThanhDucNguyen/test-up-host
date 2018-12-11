package com.hoc1.demo.Service;

import com.hoc1.demo.domain.Contact;

import java.util.List;

public interface ContactService {

    Iterable<Contact> findAll();

    List<Contact> search(String q);

    void save(Contact contact);

    void delete(int id);

    Object findOne(int id);

    void pro(int id);
}
