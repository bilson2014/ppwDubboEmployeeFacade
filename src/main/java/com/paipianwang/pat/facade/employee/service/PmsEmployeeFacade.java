package com.paipianwang.pat.facade.employee.service;

import com.paipianwang.pat.facade.employee.entity.PmsEmployee;

public interface PmsEmployeeFacade {

	public PmsEmployee doLogin(final String loginName,final String password);


}
