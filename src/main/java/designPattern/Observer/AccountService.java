package designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject {

    private User user;

    private List<Observer> observers = new ArrayList<>();

    public AccountService(String email, String ip) {
        user = new User();
        user.setEmail(email);
        user.setIp(ip);
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        observers.forEach(observer -> observer.update(user));
    }

    public void login(){
        if (!this.isValidIP() || !isValidEmail()){
            user.setLoginStatus(LoginStatus.INVALID);
        } else if (this.isValidEmail()) {
            user.setLoginStatus(LoginStatus.SUCCESS);
        }else {
            user.setLoginStatus(LoginStatus.FAILURE);
        }

        System.out.println("Login is handled");
        this.notifyAllObserver();
    }

    public void changeStatus(LoginStatus loginStatus){
        user.setLoginStatus(loginStatus);
        System.out.println("Status changed");
        notifyAllObserver();
    }

    private boolean isValidIP() {
        return "127.0.0.1".equals(user.getIp());
    }

    private boolean isValidEmail(){
        return "viet@gmail.com".equals(user.getEmail());
    }
}
