package webs.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName register
 */
@TableName(value ="register")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Register implements Serializable {
    private Integer id;
    @TableField(value = "username")
    private String username;
    @TableField(value = "password")
    private String password;
    @TableField(value = "phone_number")
    private String phoneNumber;

    @Serial
    private static final long serialVersionUID = 1L;
}