package net.jarosinski.ssb.mapper;

import net.jarosinski.ssb.controller.dto.AccountDTO;
import net.jarosinski.ssb.model.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    Account accountDTOToAccount(AccountDTO accountDTO);

    AccountDTO accountToAccountDTO(Account account);
}
