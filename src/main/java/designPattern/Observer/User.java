package designPattern.Observer;

import lombok.Data;

@Data
public class User {
    private String email;

    private String ip;

    private LoginStatus loginStatus;
}
