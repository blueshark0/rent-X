package priv.thinkam.rentx.web.service.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import priv.thinkam.rentx.common.base.BaseVO;

/**
 * category VO
 *
 * @author thinkam
 * @date 2019/01/26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class CategoryVO extends BaseVO {
	/**
	 * ID
	 */
	private Integer id;

	/**
	 * 类别名称
	 */
	private String name;

	/**
	 * 类别描述
	 */
	private String description;

	/**
	 * 父类别编号（0代表是根类别）
	 */
	private Integer parentId;

	/**
	 *  类别层次（只能为1或2或3）
	 */
	private Integer level;
}
