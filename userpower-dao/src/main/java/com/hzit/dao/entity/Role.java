package com.hzit.dao.entity;

/**
 * 
 * @author liuchao
 */
public class Role {
	/**
	 *  角色id
	 */
	private Integer roleId;
	/**
	 *  角色名字
	 */
	private String roleName;
	/**
	 *  角色描述
	 */
	private String roleDescible;
	/**
	 *  是否删除
	 */
	private String isdelete;
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
	 * 角色名字
	 * @param roleName
	 */
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
	
    /**
     * 角色名字
     * @return
     */	
    public String getRoleName(){
    	return roleName;
    }
	/**
	 * 角色描述
	 * @param roleDescible
	 */
	public void setRoleDescible(String roleDescible){
		this.roleDescible = roleDescible;
	}
	
    /**
     * 角色描述
     * @return
     */	
    public String getRoleDescible(){
    	return roleDescible;
    }
	/**
	 * 是否删除
	 * @param isdelete
	 */
	public void setIsdelete(String isdelete){
		this.isdelete = isdelete;
	}
	
    /**
     * 是否删除
     * @return
     */	
    public String getIsdelete(){
    	return isdelete;
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