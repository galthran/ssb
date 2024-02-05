package net.jarosinski.ssb.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {

    private Long cardId;

    String cardNumber;

    Long customerId;

    String cardType;

    Integer totalLimit;

    Integer amountUsed;

    Integer availableAmount;

    LocalDate createDt;
}
