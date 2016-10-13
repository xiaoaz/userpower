package com.hzit.dao.entity;

/**
 * 
 * @author liuchao
 */
public class Relevance {
	/**
	 *  关联表的id
	 */
	private Integer id;
	/**
	 *  模块id
	 */
	private Integer modelId;
	/**
	 *  角色id
	 */
	private Integer roleId;
	/**
	 *  
	 */
	private String creatName;
	/**
	 *  
	 */
	private java.util.Date creatTime;
	/**
	 *  
	 */
	private String updateName;
	/**
	 *  
	 */
	private java.util.Date updateTime;
	/**
	 * 关联表的id
	 * @param id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	
    /**
     * 关联表的id
     * @return
     */	
    public Integer getId(){
    	return id;
    }
	/**
	 * 模块id
	 * @param modelId
	 */
	public void setModelId(Integer modelId){
		this.modelId = modelId;
	}
	
    /**
     * 模块id
     * @return
     */	
    public Integer getModelId(){
    	return modelId;
    }
	/**
	 * 角色id
	 * @param roleId
	 */
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
    /**
     * 角色id
     * @return
     */	
    public Integer getRoleId(){
    	return roleId;
    }
	/**
	 * 
	 * @param creatName
	 */
	public void setCreatName(String creatName){
		this.creatName = creatName;
	}
	
    /**
     * 
     * @return
     */	
    public String getCreatName(){
    	return creatName;
    }
	/**
	 * 
	 * @param creatTime
	 */
	public void setCreatTime(java.util.Date creatTime){
		this.creatTime = creatTime;
	}
	
    /**
     * 
     * @return
     */	
    public java.util.Date getCreatTime(){
    	return creatTime;
    }
	/**
	 * 
	 * @param updateName
	 */
	public void setUpdateName(String updateName){
		this.updateName = updateName;
	}
	
    /**
     * 
     * @return
     */	
    public String getUpdateName(){
    	return updateName;
    }
	/**
	 * 
	 * @param updateTime
	 */
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	
    /**
     * 
     * @return
     */	
    public java.util.Date getUpdateTime(){
    	return updateTime;
    }
}