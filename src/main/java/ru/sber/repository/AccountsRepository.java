package ru.sber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sber.entity.Accounts;

import java.util.Optional;


@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
   Optional<Accounts> findById(Long id);


//    @Query(value = "select * from Accounts where client_id like '2'", nativeQuery = true)
//    List<Accounts> findWhereId2();
}

