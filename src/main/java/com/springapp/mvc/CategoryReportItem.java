package com.springapp.mvc;

/**
 * Created by jordanwanlass on 2/11/15.
 */
public class CategoryReportItem {
    private String CategoryName;
    private Double Total;

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }
}
