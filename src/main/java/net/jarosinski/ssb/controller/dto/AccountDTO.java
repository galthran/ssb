package net.jarosinski.ssb.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

    private Long accountId;

    Long customerId;

    Integer accountNumber;

    String accountType;

    String branchAddress;

    LocalDate createDt;
}
