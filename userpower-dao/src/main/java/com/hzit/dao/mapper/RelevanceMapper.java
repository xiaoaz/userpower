package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Relevance;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface RelevanceMapper {

	void insertRelevance(Relevance relevance);

	void deleteRelevanceById(Integer id);

	void updateRelevance(Relevance relevance);

	Page<Relevance> searchRelevanceByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Relevance> searchRelevanceByParams(@Param("map") Map<String, String> map);

} 
