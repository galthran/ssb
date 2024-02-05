package net.jarosinski.ssb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "customer_id")
    Long customerId;

    @Column(name = "account_number")
    Integer accountNumber;

    @Column(name = "account_type")
    String accountType;

    @Column(name = "branch_address")
    String branchAddress;

    @Column(name = "create_dt")
    LocalDate createDt;
}
