package com.cdi.crud.model;

import org.primefaces.model.SortOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rmpestano on 9/7/14.
 */
public class Filter<T extends BaseEntity> {
    private T entity;
    private int first;
    private int pageSize;
    private String sortField;
    private SortOrder sortOrder;
    private Map<String, Object> params = new HashMap<String, Object>();


    public Filter() {
    }

    public Filter(T entity) {
        this.entity = entity;
    }

    public Filter setFirst(int first) {
        this.first = first;
        return this;
    }

    public int getFirst() {
        return first;
    }

    public Filter setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Filter setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    public String getSortField() {
        return sortField;
    }

    public Filter setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public Filter setParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public T getEntity() {
        return entity;
    }

    public Filter setEntity(T entity) {
        this.entity = entity;
        return this;
    }
}
