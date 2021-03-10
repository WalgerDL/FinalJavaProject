package ru.sber.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Getter
@Setter
@Entity
@Table(name = "Accounts")
public class Accounts {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String account_info;

//        @Column
//        private String client_id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = ALL)
    @JoinColumn(name = "client_id")

    private Clients clients;

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", account_info='" + account_info + '\'' +
               // ", client_id='" + client_id + '\'' +
                '}';
    }

}
