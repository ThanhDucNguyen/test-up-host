package com.hoc1.demo.Service;

import com.hoc1.demo.Repository.ContactRepository;
import com.hoc1.demo.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Override
    public Iterable<Contact> findAll() {
        return contactRepository.findAll();
    }
    @Override
    public List<Contact> search(String q) {
        return contactRepository.findByNameContaining(q);
    }

    @Override
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void delete(int id) {
        contactRepository.deleteById(id);
    }

    @Override
    public Object findOne(int id) {
        return contactRepository.findById(id);
    }
    @Override
    public void pro(int id) {
//        Contact contact = new Contact();
//        Optional<Contact> contactOptional = contactRepository.findById(contact.getId());
//        if (contactOptional.isPresent()){
//            contact.
//        }contact
    }
}
