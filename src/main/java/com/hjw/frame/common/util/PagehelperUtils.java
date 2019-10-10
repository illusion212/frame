package com.hjw.frame.common.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjw.frame.common.domain.QueryRequest;

import java.util.List;
import java.util.function.Supplier;

/**
 * <Description>
 *
 * @author HJW
 * @version 1.0
 * @createDate 2019/10/09 15:00
 * @see com.hjw.frame.common.util
 */
public class PagehelperUtils {
    
    public static PageInfo<?> getPage(QueryRequest request, Supplier<?> s){
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        PageInfo<?> pageInfo = new PageInfo<>((List<?>) s.get());
        PageHelper.clearPage();
        return pageInfo;
    }
}
