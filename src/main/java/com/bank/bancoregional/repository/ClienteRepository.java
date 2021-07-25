/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bancoregional.repository;

import com.bank.bancoregional.entity.Cliente;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import static javax.transaction.Transactional.TxType.REQUIRED;


@ApplicationScoped
public class ClienteRepository {
    

    @PersistenceContext(unitName = "BankDB_PU")
    private EntityManager em;

    @Transactional(REQUIRED)
    public void create(Cliente cliente) {
        em.persist(cliente);
    }
    
    public List<Cliente> findAll() {
        return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
    }

}
