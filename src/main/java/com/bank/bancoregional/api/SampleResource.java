package com.bank.bancoregional.api;

import com.bank.bancoregional.entity.Cliente;
import com.bank.bancoregional.repository.ClienteRepository;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("sample")
public class SampleResource {

    @Inject
    private ClienteRepository clienteRepository;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createPerson(Cliente cliente) {
        clienteRepository.create(cliente);
        return Response.ok(cliente).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> getAllCliente() {
        
        System.out.println("fetching data from database");
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }

}
