package com.hzit.dao.vo;

/**
 * 
 * @author liuchao
 */
public class ModelVo {
	/**
	 *  模块id
	 */
	private Integer modelId;
	/**
	 *  模块名字
	 */
	private String modelName;
	/**
	 *  父模块id
	 */
	private Integer parentid;
	/**
	 *  模块地址
	 */
	private String modelUrl;
	/**
	 *  是否有子模块
	 */
	private String havechild;
	/**
	 *  序列号
	 */
	private Integer serialNum;
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
	 * 模块id
	 * @param modelId
	 */
	public void setModelId(Integer modelId){
		this.modelId = modelId;
	}
	
    /**
     * 模块id
     * @return Integer
     */	
    public Integer getModelId(){
    	return modelId;
    }
	/**
	 * 模块名字
	 * @param modelName
	 */
	public void setModelName(String modelName){
		this.modelName = modelName;
	}
	
    /**
     * 模块名字
     * @return String
     */	
    public String getModelName(){
    	return modelName;
    }
	/**
	 * 父模块id
	 * @param parentid
	 */
	public void setParentid(Integer parentid){
		this.parentid = parentid;
	}
	
    /**
     * 父模块id
     * @return Integer
     */	
    public Integer getParentid(){
    	return parentid;
    }
	/**
	 * 模块地址
	 * @param modelUrl
	 */
	public void setModelUrl(String modelUrl){
		this.modelUrl = modelUrl;
	}
	
    /**
     * 模块地址
     * @return String
     */	
    public String getModelUrl(){
    	return modelUrl;
    }
	/**
	 * 是否有子模块
	 * @param havechild
	 */
	public void setHavechild(String havechild){
		this.havechild = havechild;
	}
	
    /**
     * 是否有子模块
     * @return String
     */	
    public String getHavechild(){
    	return havechild;
    }
	/**
	 * 序列号
	 * @param serialNum
	 */
	public void setSerialNum(Integer serialNum){
		this.serialNum = serialNum;
	}
	
    /**
     * 序列号
     * @return Integer
     */	
    public Integer getSerialNum(){
    	return serialNum;
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
     * @return String
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
     * @return java.util.Date
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
     * @return String
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
     * @return java.util.Date
     */	
    public java.util.Date getUpdateTime(){
    	return updateTime;
    }
}