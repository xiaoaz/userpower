package com.hzit.dao.entity;

/**
 * 
 * @author liuchao
 */
public class Userinfo {
	/**
	 *  用户ID
	 */
	private String userid;
	/**
	 *  用户名
	 */
	private String username;
	/**
	 *  用户密码
	 */
	private String userpwd;
	/**
	 *  角色id
	 */
	private Integer roleId;
	/**
	 *  是否禁用
	 */
	private Integer isuse;
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
	 * 用户ID
	 * @param userid
	 */
	public void setUserid(String userid){
		this.userid = userid;
	}
	
    /**
     * 用户ID
     * @return
     */	
    public String getUserid(){
    	return userid;
    }
	/**
	 * 用户名
	 * @param username
	 */
	public void setUsername(String username){
		this.username = username;
	}
	
    /**
     * 用户名
     * @return
     */	
    public String getUsername(){
    	return username;
    }
	/**
	 * 用户密码
	 * @param userpwd
	 */
	public void setUserpwd(String userpwd){
		this.userpwd = userpwd;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getUserpwd(){
    	return userpwd;
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
	 * 是否禁用
	 * @param isuse
	 */
	public void setIsuse(Integer isuse){
		this.isuse = isuse;
	}
	
    /**
     * 是否禁用
     * @return
     */	
    public Integer getIsuse(){
    	return isuse;
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