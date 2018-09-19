package cn.chinaunicom.func.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 节点注册
 * </p>
 *
 * @author zuohongwei
 * @since 2018-09-17
 */
@TableName("hr_func_register")
@ApiModel("节点注册")
public class FuncRegister extends Model<FuncRegister> {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 节点路径
     */
     @ApiModelProperty(value="节点路径")
    private String url;
    /**
     * 节点名称
     */
     @ApiModelProperty(value="节点名称")
    private String name;
    /**
     * 节点编码
     */
     @ApiModelProperty(value="节点编码")
    private String code;
    /**
     * 描述
     */
     @ApiModelProperty(value="描述")
    private String description;
    /**
     * 所属模块
     */
     @ApiModelProperty(value="所属模块")
    private String module;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "FuncRegister{" +
        ", id=" + id +
        ", url=" + url +
        ", name=" + name +
        ", code=" + code +
        ", description=" + description +
        ", module=" + module +
        "}";
    }
}
