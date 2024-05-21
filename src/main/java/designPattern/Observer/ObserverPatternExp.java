package designPattern.Observer;

public class ObserverPatternExp {
    public static void main(String[] args) {
        AccountService account1 = createAccount("viet@gmail.com", "127.0.0.1");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);

        System.out.println("---");
        AccountService account2 = createAccount("bnd@gmail.com", "129.0.1.1.1");
        account2.login();
    }

    private static AccountService createAccount(String mail, String ip) {
        AccountService accountService = new AccountService(mail, ip);
        accountService.attach(new Logger());
        accountService.attach(new Mailer());
        accountService.attach(new Protector());
        return accountService;
    }
}
