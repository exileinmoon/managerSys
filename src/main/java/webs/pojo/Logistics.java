package webs.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @TableName logistics
 */
@TableName(value ="logistics")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Logistics implements Serializable {
    @TableField(value = "logistics_id")
    private Integer logisticsId;
    @TableField(value = "number")
    private Integer number;
    @TableField(value = "state")
    private String state;
    @TableField(value = "phone_number")
    private Integer phoneNumber;
    @TableField(value = "company")
    private String company;
    @TableField(value = "name")
    private Integer name;
    private static final long serialVersionUID = 1L;
}