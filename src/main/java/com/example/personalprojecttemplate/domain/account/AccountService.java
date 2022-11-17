package com.example.personalprojecttemplate.domain.account;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountDtoMapper mapper;

    @Transactional(readOnly = true)
    public AccountDto findById(Long id) {
        return mapper.toAccountDto(accountRepository.findById(id).orElse(null));
    }

    @Transactional
    public AccountDto insert(AccountDto accountDto) {
        return mapper.toAccountDto(accountRepository.save(mapper.fromAccountDto(accountDto)));
    }

    @Transactional
    public AccountDto update(Long id, AccountDto accountDto) {
        Account account = mapper.fromAccountDto(accountDto);
        account.setId(id);
        return mapper.toAccountDto(accountRepository.save(account));
    }

    @Transactional
    public void deleteById(Long id) {
        accountRepository.deleteById(id);
    }
}
