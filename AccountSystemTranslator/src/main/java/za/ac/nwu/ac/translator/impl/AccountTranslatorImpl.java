package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountDto;
import za.ac.nwu.ac.domain.persistence.MEMBER_TABLE;
import za.ac.nwu.ac.repo.persistence.MemberRepository;
import za.ac.nwu.ac.translator.AccountTranslator;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTranslatorImpl implements AccountTranslator {

    private final MemberRepository memberRepository;

    @Autowired
    public AccountTranslatorImpl(MemberRepository memberRepository)
    {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<AccountDto> getAllAccounts()
    {
        List<AccountDto> accountDtos = new ArrayList<>();
        try{
            for (MEMBER_TABLE accountDto2 : memberRepository.findAll()){
                accountDtos.add(new AccountDto(accountDto2));
            }
        } catch (Exception e)
        {
            throw new RuntimeException("Unable to read from the DB");
        }

        return accountDtos;
    }
}
