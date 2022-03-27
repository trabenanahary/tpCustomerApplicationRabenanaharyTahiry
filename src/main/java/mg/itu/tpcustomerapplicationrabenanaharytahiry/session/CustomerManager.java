/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mg.itu.tpcustomerapplicationrabenanaharytahiry.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mg.itu.tpcustomerapplicationrabenanaharytahiry.entities.Customer;

/**
 *
 * @author admin
 */
@Stateless
public class CustomerManager {
    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    /**
     *
     * @param object
     */
    public void persist(Object object) {
      em.persist(object);
    }
    /**
     * 
     * @return 
     */
    public List<Customer> getAllCustomers() {  
       Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList();
    }  
        
    /**
     *
     * @param customer
     * @return
     */
    public Customer update(Customer customer) {
      return null;  
    } 
}
