package net.jarosinski.ssb.service;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.LoanDTO;
import net.jarosinski.ssb.mapper.LoanMapper;
import net.jarosinski.ssb.model.Loan;
import net.jarosinski.ssb.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class LoanService {

    private final LoanRepository loanRepository;

    private final LoanMapper loanMapper;

    public List<LoanDTO> getAllLoans() {
        Iterable<Loan> iterable = loanRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .map(this::convertLoanToLoanDTO)
                .toList();
    }

    private LoanDTO convertLoanToLoanDTO(Loan loan) {
        return loanMapper.loanToLoanDTO(loan);
    }
}
