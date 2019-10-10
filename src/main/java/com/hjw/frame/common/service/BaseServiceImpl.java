package com.hjw.frame.common.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }

    @Override
    public T selectById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> selectList(T entity) {
        return mapper.select(entity);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public List<T> selectListAll() {
        return mapper.selectAll();
    }

    @Override
    public int selectCount(T entity) {
        return mapper.selectCount(entity);
    }

    @Override
    public PageInfo<T> selectPage(int pageNum, int pageSize, T entity) {
        PageHelper.startPage(pageNum, pageSize);
        List<T> list = mapper.select(entity);
        PageInfo<T> page = new PageInfo<>(list);
        return page;
    }

    @Override
    public int insert(T entity) {
        return mapper.insert(entity);
    }

    @Override
    public int insertSelective(T entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public int deleteById(Object id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int batchDelete(List<String> list, String property, Class<T> clazz) {
        Example example = new Example(clazz);
        example.createCriteria().andIn(property, list);
        return mapper.deleteByExample(example);
    }

    @Override
    public int updateById(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateSelectiveById(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int updateSelectiveByExampleId(T entity, String name, Object id, Class<T> clazz) {
        Example example = new Example(clazz);
        example.createCriteria().andCondition(name, id);
        return mapper.updateByExampleSelective(entity, example);
    }

}
