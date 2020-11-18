package com.clivia.mapper.provider;
import org.apache.ibatis.jdbc.SQL;
public class CategoryProvider {
    public String listCategory(){
        String listCategorySQL = new SQL() {
            {
                SELECT("*");
                FROM("category_");
            }
        }.toString();
        return listCategorySQL;
    }
}
