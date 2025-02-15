import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.advanced_junit_practice_problems.testing_banking_transactions.BankAccount;
class BankAccountTest {
    private BankAccount account;

    // Initialize a BankAccount instance before each test
    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    // Test for correct balance after deposit
    @Test
    void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), "Balance should be 100 after depositing 100.");

        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be 150 after depositing 50.");
    }

    // Test for withdrawal with sufficient funds
    @Test
    void testWithdrawWithSufficientFunds() {
        account.deposit(200.0);
        boolean result = account.withdraw(100.0);
        assertTrue(result, "Withdrawal should succeed with sufficient funds.");
        assertEquals(100.0, account.getBalance(), "Balance should be 100 after withdrawing 100.");
    }

    // Test for withdrawal with insufficient funds
    @Test
    void testWithdrawWithInsufficientFunds() {
        account.deposit(100.0);
        boolean result = account.withdraw(150.0);
        assertFalse(result, "Withdrawal should fail if there are insufficient funds.");
        assertEquals(100.0, account.getBalance(), "Balance should remain 100 after failed withdrawal.");
    }

    // Test for getting the current balance
    @Test
    void testGetBalance() {
        assertEquals(0.0, account.getBalance(), "Balance should be 0 initially.");

        account.deposit(50.0);
        assertEquals(50.0, account.getBalance(), "Balance should be 50 after depositing 50.");
    }
}

