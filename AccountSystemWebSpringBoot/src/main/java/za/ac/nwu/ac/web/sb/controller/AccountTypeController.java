package za.ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.ac.domain.dto.AccountDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.nwu.ac.logic.flow.FetchAccountFlow;

import java.util.List;

@Component
@RestController
@RequestMapping("account-miles")

public class AccountTypeController {

    private final FetchAccountFlow fetchAccountFlow;

    @Autowired
    public AccountTypeController(FetchAccountFlow fetchAccountFlow)
    {
        this.fetchAccountFlow = fetchAccountFlow;
    }

    @GetMapping("/All Accounts")
    @ApiOperation(value = "Views all accounts", notes = "Returns all accounts in DB")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<List<AccountDto>>> getAll() {
        List<AccountDto> accounts = fetchAccountFlow.getAllAccounts();
        GeneralResponse<List<AccountDto>> response = new GeneralResponse<>(true, accounts);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }



}

