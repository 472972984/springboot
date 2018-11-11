package indi.chq.mapper;

import org.apache.ibatis.annotations.Mapper;

import indi.chq.entity.Users;

@Mapper
public interface UsersMapper {

    Users selectByPrimaryKey(Long id);
    
}