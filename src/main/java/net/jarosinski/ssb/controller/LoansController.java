package net.jarosinski.ssb.controller;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.LoanDTO;
import net.jarosinski.ssb.service.LoanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoansController {

    private final LoanService loanService;

    @GetMapping("/myLoans")
    public List<LoanDTO> getLoanDetails() {
        return loanService.getAllLoans();
    }
}
