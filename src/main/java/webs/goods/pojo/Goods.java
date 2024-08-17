package webs.goods.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @TableName goods
 */

@Data
public class Goods implements Serializable {
    private Integer goodId;

    private String goodName;

    private BigDecimal goodPrice;

    private String goodStock;

    private String goodType;

    private static final long serialVersionUID = 1L;
}