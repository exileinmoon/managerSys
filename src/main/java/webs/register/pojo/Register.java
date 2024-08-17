package webs.register.pojo;


import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName register
 */

@Data
public class Register implements Serializable {
    private Integer id;
    private String username;

    private String password;

    private String phoneNumber;

    @Serial
    private static final long serialVersionUID = 1L;
}