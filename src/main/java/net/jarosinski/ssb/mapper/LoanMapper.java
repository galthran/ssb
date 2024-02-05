package net.jarosinski.ssb.mapper;

import net.jarosinski.ssb.controller.dto.LoanDTO;
import net.jarosinski.ssb.model.Loan;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoanMapper {

    Loan loanDTOToLoan(LoanDTO loanDTO);

    LoanDTO loanToLoanDTO(Loan loan);
}
