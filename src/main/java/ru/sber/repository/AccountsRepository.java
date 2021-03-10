package ru.sber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sber.entity.Accounts;

import java.util.List;


@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
   List<Accounts> findById();
   //List<Accounts> findByPan();

//    @Query(value = "select * from Accounts where client_id like '2'", nativeQuery = true)
//    List<Accounts> findWhereId2();
}

