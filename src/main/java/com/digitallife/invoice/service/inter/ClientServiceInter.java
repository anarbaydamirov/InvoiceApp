package com.digitallife.invoice.service.inter;

import com.digitallife.invoice.entity.Client;

import java.util.List;

public interface ClientServiceInter {

    public List<Client> getAllClients();

    public Client getClientById(int id);

    public Integer addClient(Client client);

    public boolean updateClient(Client client);

    public boolean deleteClient(int id);
}
