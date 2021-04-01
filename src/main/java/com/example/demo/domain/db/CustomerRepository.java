/**
 * Copyright (c) 2021
 * <p>
 * long description for the file
 *
 * @summary short description for the file
 * @author Kevin Coorens <kevin.coorens@student.be>
 * <p>
 * Created at     : 31/03/2021 21:48
 */

package com.example.demo.domain.db;

import com.example.demo.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findCustomerByEmail(String email);

    /*    @Query("SELECT b FROM Bus b WHERE b.vertrekPlaats = ?1")
    List<Bus> findBussenMetvertrekPlaats(String vertrekPlaats);*/

    @Modifying
    @Query("UPDATE Box set customer_id = null WHERE customer_id =?1")
    public void safeDeleteCustomerOne(String email);

    @Modifying
    @Query( "DELETE FROM Customer WHERE email = ?1")
    public void safeDeleteCustomerTwo(String email);
}