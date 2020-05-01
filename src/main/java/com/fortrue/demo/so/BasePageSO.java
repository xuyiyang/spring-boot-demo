package com.fortrue.demo.so;

import com.fortrue.demo.util.NumberUtil;

public class BasePageSO {

    private Long pageNumber = 1L;
    private Long startIndex = 0L;
    private Long numPerPage = 50L;
    private Long stopIndex = 50L;

    public Long getPageNumber() {
        return pageNumber;
    }

    public BasePageSO setPageNumber(Long pageNumber) {
        this.pageNumber = NumberUtil.notLessThanZero(pageNumber, 1L);
        this.startIndex = (this.pageNumber - 1) * this.numPerPage;
        this.stopIndex = this.pageNumber * this.numPerPage;
        return this;
    }

    public Long getStartIndex() {
        return startIndex;
    }

    public Long getNumPerPage() {
        return numPerPage;
    }

    public BasePageSO setNumPerPage(Long numPerPage) {
        this.numPerPage = NumberUtil.notLessThanZero(numPerPage, 50L);
        this.startIndex = (this.pageNumber - 1) * this.numPerPage;
        this.stopIndex = this.pageNumber * this.numPerPage;
        return this;
    }

    public Long getStopIndex() {
        return stopIndex;
    }
}
