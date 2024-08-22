package webs.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @TableName fund
 */
@TableName(value ="fund")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fund implements Serializable {
    @TableField(value = "fund_id")
    private Integer fundId;

    @TableField(value = "fund_day")
    private java.sql.Date fundDay;

    @TableField(value = "information")
    private String information;

    @TableField(value = "price")
    private BigDecimal price;

    @TableField(value = "fund_type")
    private String fundType;

    @Serial
    private static final long serialVersionUID = 1L;
}