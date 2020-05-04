package co.edureka;

import java.util.List;

public interface AccountDAO 
{
 void createAccount(Account acc);
 void updateAccount(Account acc);
 void deleteAccount(long acno);
 List<Account> getAccounts();
}
