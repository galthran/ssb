package net.jarosinski.ssb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "cards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "card_id")
    private Long cardId;

    @Column(name = "card_number")
    String cardNumber;

    @Column(name = "customer_id")
    Long customerId;

    @Column(name = "card_type")
    String cardType;

    @Column(name = "total_limit")
    Integer totalLimit;

    @Column(name = "amount_used")
    Integer amountUsed;

    @Column(name = "available_amount")
    Integer availableAmount;

    @Column(name = "create_dt")
    LocalDate createDt;
}
