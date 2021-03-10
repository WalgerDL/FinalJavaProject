package ru.sber.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sber.entity.Clients;
import ru.sber.repository.ClientsRepository;

import java.util.List;

@Service
public class ClientsService {

    @Autowired



    private final ClientsRepository clientsRepository;

    public ClientsService(ClientsRepository clientsRepository){
        this.clientsRepository = clientsRepository;
    }
    List<Clients> findByPan(String pan){
        return clientsRepository.findByPan("5469000022220888");
    }


//    public void createClients(Clients clients){
//        clientsRepository.save(clients);
//    }

}


