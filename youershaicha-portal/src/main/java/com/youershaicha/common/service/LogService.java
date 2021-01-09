package com.youershaicha.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.youershaicha.common.domain.LogDO;
import com.youershaicha.common.domain.PageDO;
import com.youershaicha.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
