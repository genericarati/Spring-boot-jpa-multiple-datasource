package com.foobar;

import com.foobar.book.domain.Book;
import com.foobar.book.repo.BookRepository;
import com.foobar.customer.domain.Customer;
import com.foobar.customer.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookCustomerController {
  
  private final BookRepository bookRepo;
  private final CustomerRepository customerRepo;
  
  @Autowired
  BookCustomerController(BookRepository bookRepo, CustomerRepository customerRepo) {
    this.bookRepo = bookRepo;
    this.customerRepo = customerRepo;
  }
  
  @RequestMapping("/bookCustomer/{id}")
  public String fooBar(@PathVariable("id") Long id) {
    Book foo = bookRepo.findById(id);
    Customer bar = customerRepo.findById(id);
    
    return foo.getName() + " " + bar.getName();
  }
}