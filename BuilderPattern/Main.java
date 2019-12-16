package BuilderPattern;

public class Main {

    // https://dzone.com/articles/design-patterns-the-builder-pattern

    public static void main(String[] args) {
        OldBankAccount oldBankAccount1 = new OldBankAccount(456L, "Marge", "Springfield", 100.00, 2.5);
        OldBankAccount oldBankAccount2 = new OldBankAccount(789L, "Homer", null, 2.5, 100.00);

        BankAccount bankAccount1 = new BankAccount.Builder(1387L)
                .withOwner("Marge")
                .atBranch("Springfield")
                //.openingBalance(100.0)
                .atRate(2.5)
                .build();

    }
}
