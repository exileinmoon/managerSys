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
 * @TableName goods
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value ="goods")
public class Goods implements Serializable {
    @TableField(value = "good_id")
    private Integer goodId;
    @TableField(value = "good_name")
    private String goodName;
    @TableField(value = "good_price")
    private BigDecimal goodPrice;
    @TableField(value = "good_stock")
    private String goodStock;
    @TableField(value = "good_type")
    private String goodType;

    @Serial
    private static final long serialVersionUID = 1L;
}