package za.nwu.ac.logic.flow;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountDto;

import java.util.List;


public interface FetchAccountFlow {

    List<AccountDto> getAllAccounts();
}
