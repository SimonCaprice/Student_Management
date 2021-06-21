package gdit.student_management.base.result;


import java.io.Serializable;

/**
 * 分页查询参数
 */
public class PageTableRequest implements Serializable {

    private static final long serialVersionUID = 7328071045193618467L;
    private Integer page;
    private Integer limit;
    private Integer offset;

    public void countOffset() {
		if (null == this.page || null == this.limit) {
            this.offset = 0;
            return;
        }
		this.offset = (this.page - 1) * this.limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "PageTableRequest{" +
                "page=" + page +
                ", limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
