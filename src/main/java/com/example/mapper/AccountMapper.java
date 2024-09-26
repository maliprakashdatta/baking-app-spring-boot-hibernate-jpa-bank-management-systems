package com.example.mapper;
import com.example.dto.AccountDto;
import com.example.entity.Account;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource
public class AccountMapper
{
    public static Account mapToAccount(AccountDto accountDto)
    {
        Account account =new Account(
                accountDto.getId(),
                accountDto.getAccountNumber(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance(),
                accountDto.getCustomerId()
        );
        System.out.println("Mapped Account: " + account);
        return account;
    }
    public static AccountDto mapToAccountDto(Account account)
    {
        AccountDto accountDto =new AccountDto(

                account.getId(),
                account.getAccountNumber(),
                account.getAccountHolderName(),
                account.getBalance(),
                account.getCustomerId()
        );
        return accountDto;
    }
}
