package com.hoc1.demo.Repository;

import java.util.List;

import com.hoc1.demo.domain.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

    List<Contact> findByNameContaining(String q);// là phương thức tìm kiếm liên hệ có name LIKE %name%

}
