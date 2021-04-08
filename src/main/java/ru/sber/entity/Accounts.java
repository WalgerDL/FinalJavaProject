package ru.sber.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
@AllArgsConstructor
@NoArgsConstructor
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



    @ManyToOne(fetch = FetchType.EAGER, cascade = ALL)
    @JoinColumn(name = "client_id")

    private Clients clients;

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", account_info='" + account_info + '\'' +
                '}';
    }

}
