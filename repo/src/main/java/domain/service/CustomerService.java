package domain.service;


import domain.db.CustomerRepository;
import domain.model.Customer;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer add(Customer customer) throws ServiceException {
        //check of box leeg is?
        return customerRepository.save(customer);
    }

    public Iterable<Customer> getAll() {
        return customerRepository.findAll();
    }
}
