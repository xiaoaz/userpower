package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Model;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface ModelMapper {

	void insertModel(Model model);

	void deleteModelByModelId(Integer modelId);

	void updateModel(Model model);

	Page<Model> searchModelByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Model> searchModelByParams(@Param("map") Map<String, String> map);

} 
