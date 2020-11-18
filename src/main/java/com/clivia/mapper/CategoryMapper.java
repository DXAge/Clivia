package com.clivia.mapper;

import java.util.List;

import com.clivia.bean.category.Category;
import com.clivia.mapper.provider.CategoryProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;


@Mapper
public interface CategoryMapper {

    @SelectProvider(type = CategoryProvider.class,method = "listCategory")
    List<Category> findAll();

}