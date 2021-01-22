package com.austin.common.mapper;

import com.austin.common.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 权限 Mapper 接口
 * </p>
 *
 * @author GongJun
 * @since 2019-08-28
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

}
