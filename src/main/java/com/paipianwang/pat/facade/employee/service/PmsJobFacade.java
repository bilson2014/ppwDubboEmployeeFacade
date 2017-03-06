package com.paipianwang.pat.facade.employee.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.employee.entity.PmsJob;

public interface PmsJobFacade {

	public DataGrid<PmsJob> listWithPagination(PageParam pageParam, Map<String, Object> paramMap);

	public long update(final PmsJob job);

	public long save(final PmsJob job);

	public long delete(final long[] ids);

	public List<PmsJob> getAll();

	public PmsJob findJobById(final Long id);



}
