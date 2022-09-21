package com.samrat.moviebookingapp.Dao;
import com.samrat.moviebookingapp.Entities.Customer;

public interface CustomerDao {
    public Customer save(Customer customer);
    public Customer findById(int id);
    public Customer update(Customer customer);
    public void delete(Customer customer);
}
