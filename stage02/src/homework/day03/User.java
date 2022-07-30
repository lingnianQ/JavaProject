package homework.day03;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    private String pwd;
    private String nick;
    private int age;

}
