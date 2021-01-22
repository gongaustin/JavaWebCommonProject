package com.austin.common.mapper;

import com.austin.common.entity.Permission;
import com.austin.common.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 角色 Mapper 接口
 * </p>
 *
 * @author GongJun
 * @since 2019-08-28
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
    List<Permission> getPermissionsByRoleId(@Param("id") String id, @Param("type") Integer type);
}
