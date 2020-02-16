package com.zaj.Subdatabase_Subtable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zaj.Subdatabase_Subtable.datasource.DataSourceNames;
import com.zaj.Subdatabase_Subtable.datasource.TargetDataSource;
import com.zaj.Subdatabase_Subtable.entity.SysUser;
import com.zaj.Subdatabase_Subtable.mapper.SysUserMapper;
import com.zaj.Subdatabase_Subtable.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser findUserByFirstDb(long id) {
        return this.baseMapper.selectById(id);
    }

    @TargetDataSource(name = DataSourceNames.SECOND)
    @Override
    public SysUser findUserBySecondDb(long id) {

        return this.baseMapper.selectById(id);
    }

}
