/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bancoregional.api.util;

import com.bank.bancoregional.entity.Cliente;
import com.bank.bancoregional.repository.ClienteRepository;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author jganrica
 */
@Singleton
@Startup
public class AppDataInitializer {

    @Inject
    private ClienteRepository clienteRepository;

    @PostConstruct
    public void init() {

        Cliente c1 = new Cliente("miguel", "cardenas", "0001_miguel_cardenas", Hashing.performMd5("1231"));
        Cliente c2 = new Cliente("laura", "perez", "0002_laura_perez", Hashing.performMd5("1231"));
        clienteRepository.create(c1);
        clienteRepository.create(c2);

        System.out.println(c1);
        System.out.println(c2);
    }

}
