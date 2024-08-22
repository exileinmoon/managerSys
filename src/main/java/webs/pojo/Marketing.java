package webs.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName marketing
 */
@TableName(value ="marketing")
@Data
public class Marketing implements Serializable {
    private String information;

    private Integer markingId;

    private static final long serialVersionUID = 1L;
}