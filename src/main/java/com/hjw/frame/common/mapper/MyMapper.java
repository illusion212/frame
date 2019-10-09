package com.hjw.frame.common.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <Description>
 *
 * @author HJW
 * @version 1.0
 * @createDate 2019/10/09 9:30
 * @see com.hjw.frame.common.mapper
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
