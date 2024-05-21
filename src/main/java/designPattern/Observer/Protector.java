package designPattern.Observer;

public class Protector implements Observer{
    @Override
    public void update(User user) {
        if (user.getLoginStatus().equals(LoginStatus.INVALID)){
            System.out.println("Protector: User " + user.getEmail() + " is invalid. "
                    + "IP " + user.getIp() + " is blocked");
        }
    }
}
