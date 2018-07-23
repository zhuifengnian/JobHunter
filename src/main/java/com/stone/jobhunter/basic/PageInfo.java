package com.stone.jobhunter.basic;

import java.io.Serializable;
import java.util.List;

public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer pageNum = 1;
    private Integer pageSize = 10;
    private Integer total;
    private List<T> rows;

    /**
     * 总页数，在得到total时获取。计算公式如下：
     * if (totalNum % bean.getPageSize() == 0) {//记录当前页数
     * bean.setTotalPage(totalNum / bean.getPageSize());
     * } else {
     * bean.setTotalPage(totalNum / bean.getPageSize() + 1);
     * }
     */
    private Integer totalPage;  //总页数

    public PageInfo() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getStart() {
        if (pageNum == null)
            pageNum = 1;
        if (pageSize == null)
            pageSize = 10;
        return (pageNum - 1) * pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if (pageNum == null || pageNum <= 1)
            this.pageNum = 1;
        else
            this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize == null || pageSize >= 10)
            this.pageSize = 10;
        else
            this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
        totalPage = (total % pageSize == 0 ? total / pageSize : total / pageSize + 1);
    }

    /**
     * 必须在setTotal之后，才能调用
     * @return 总页数
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", rows=" + rows +
                '}';
    }
}