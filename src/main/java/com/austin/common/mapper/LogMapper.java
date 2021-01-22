package com.austin.common.mapper;

import com.austin.common.entity.Log;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 操作日志表 Mapper 接口
 * </p>
 *
 * @author GongJun
 * @since 2020-08-28
 */
/**
 * @description: 高版本的MybatisPlus更规范了，Mapper中必须加上@Mapper注解，否则启动时容器无法注入bean
 * @author: GongJun
 * @time: Created in 12:44 2021/1/22
 **/
@Mapper
public interface LogMapper extends BaseMapper<Log> {

}
