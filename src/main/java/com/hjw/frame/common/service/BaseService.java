package com.hjw.frame.common.service;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公共service
 *
 * @param <T>
 */
@Service
public interface BaseService<T> {

    /**
     * 查询
     *
     * @param entity
     * @return
     */
    T selectOne(T entity);

    /**
     * 通过Id查询
     *
     * @param id
     * @return
     */
    T selectById(Object id);

    /**
     * 查询列表
     *
     * @param entity
     * @return
     */
    List<T> selectList(T entity);

    /**
     * 查询列表
     *
     * @param example
     * @return
     */
    List<T> selectByExample(Object example);

    /**
     * 获取所有对象
     *
     * @return
     */
    List<T> selectListAll();

    /**
     * 查询总记录数
     *
     * @param entity
     * @return
     */
    int selectCount(T entity);

    /**
     * 分页查询
     *
     * @param pageNum
     * @param pageSize
     * @param entity
     * @return
     */
    PageInfo<T> selectPage(int pageNum, int pageSize, T entity);

    /**
     * 添加
     *
     * @param entity
     */
    int insert(T entity);

    /**
     * 插入 不插入null字段
     *
     * @param entity
     */
    int insertSelective(T entity);

    /**
     * 根据Id删除
     *
     * @param id
     */
    int deleteById(Object id);

    /**
     * 批量删除
     *
     * @param list
     * @param property
     * @param clazz
     * @return
     */
    int batchDelete(List<String> list, String property, Class<T> clazz);

    /**
     * 根据id更新
     *
     * @param entity
     */
    int updateById(T entity);

    /**
     * 不update null
     *
     * @param entity
     */
    int updateSelectiveById(T entity);

    /**
     * 更新
     *
     * @param entity
     * @param name
     * @param id
     * @param clazz
     * @return
     */
    int updateSelectiveByExampleId(T entity, String name, Object id, Class<T> clazz);

}
