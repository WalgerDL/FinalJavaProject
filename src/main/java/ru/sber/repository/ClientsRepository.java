package ru.sber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sber.entity.Clients;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {
 List<Clients> findByPan(String pan);
}
