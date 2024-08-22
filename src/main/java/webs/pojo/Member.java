package webs.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName member
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {
    @TableField("member_id")
    private Integer memberId;

    @TableField("member_name")
    private String memberName;
    @TableField("member_time")
    private String memberTime;
    @TableField("member_phone")
    private String memberLevel;

    @Serial
    private static final long serialVersionUID = 1L;
}