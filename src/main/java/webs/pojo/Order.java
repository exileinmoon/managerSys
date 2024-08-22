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
 * @TableName order
 */
@TableName(value ="order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    @TableField("order_id")
    private Integer orderId;
    @TableField("customer_name")
    private String customerName;
    @TableField("trade_name")
    private String tradeName;
    @TableField("number")
    private Integer number;
    @TableField("amount")
    private BigDecimal amount;
    @Serial
    private static final long serialVersionUID = 1L;
}