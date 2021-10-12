package za.nwu.ac.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountDto;
import za.ac.nwu.ac.translator.AccountTranslator;
import za.nwu.ac.logic.flow.FetchAccountFlow;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class FetchAccountFlowImpl implements FetchAccountFlow {

    private final AccountTranslator accountTranslator;

    @Autowired
    public FetchAccountFlowImpl(AccountTranslator accountTranslator)
    {
        this.accountTranslator = accountTranslator;
    }


    @Override
    public List<AccountDto> getAllAccounts() {
        return accountTranslator.getAllAccounts();
    }
}
