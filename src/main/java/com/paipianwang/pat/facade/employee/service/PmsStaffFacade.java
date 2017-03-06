package com.paipianwang.pat.facade.employee.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.employee.entity.PmsStaff;

public interface PmsStaffFacade {

	public DataGrid<PmsStaff> listWithPagination(PageParam pageParam, Map<String, Object> paramMap);

	public long  save(final PmsStaff staff);

	public long updateImagePath(final PmsStaff staff);

	public long update(final PmsStaff staff);

	public List<PmsStaff> findStaffsByArray(final long[] ids);

	public long deleteByArray(final long[] ids);

	public List<PmsStaff> getAll();

	public PmsStaff findStaffById(final long staffId);


}
