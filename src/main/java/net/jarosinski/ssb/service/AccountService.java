package net.jarosinski.ssb.service;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.AccountDTO;
import net.jarosinski.ssb.mapper.AccountMapper;
import net.jarosinski.ssb.model.Account;
import net.jarosinski.ssb.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    private final AccountMapper accountMapper;

    public List<AccountDTO> getAllAccounts() {
        Iterable<Account> iterable = accountRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .map(this::convertAccountToAccountDTO)
                .toList();
    }

    private AccountDTO convertAccountToAccountDTO(Account account) {
        return accountMapper.accountToAccountDTO(account);
    }
}
