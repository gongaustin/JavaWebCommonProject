package com.austin.common.mapper;

import com.austin.common.entity.Permission;
import com.austin.common.entity.Role;
import com.austin.common.entity.User;
import com.austin.common.entity.vo.UserVo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户人员 Mapper 接口
 * </p>
 *
 * @author GongJun
 * @since 2019-08-28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<Permission> selectUserPermissionsByWrapper(@Param("ew") Wrapper wrapper);

    List<UserVo> selectUserVoPage(Page page, @Param("ew") Wrapper wrapper);

    UserVo findUserById(@Param("id") String id);

    List<Role> getRolesByManagerId(@Param("id") String id);

    List<Permission> selectUserModulessByWrapper(@Param("id") String id);


}
