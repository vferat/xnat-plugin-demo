/*
 * GENERATED FILE
 *
 */
package org.nrg.xdat.om.base.auto;
import org.apache.log4j.Logger;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.*;
import org.nrg.xft.utils.ResourceFile;
import org.nrg.xft.exception.*;

import java.util.*;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE
 *
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class AutoExProjectmetadata extends XnatAbstractprojectasset implements org.nrg.xdat.model.ExProjectmetadataI {
	public static final Logger logger = Logger.getLogger(AutoExProjectmetadata.class);
	public static final String SCHEMA_ELEMENT_NAME="ex:projectMetadata";

	public AutoExProjectmetadata(ItemI item)
	{
		super(item);
	}

	public AutoExProjectmetadata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoExProjectmetadata(UserI user)
	 **/
	public AutoExProjectmetadata(){}

	public AutoExProjectmetadata(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "ex:projectMetadata";
	}
	 private org.nrg.xdat.om.XnatAbstractprojectasset _Abstractprojectasset =null;

	/**
	 * abstractProjectAsset
	 * @return org.nrg.xdat.om.XnatAbstractprojectasset
	 */
	public org.nrg.xdat.om.XnatAbstractprojectasset getAbstractprojectasset() {
		try{
			if (_Abstractprojectasset==null){
				_Abstractprojectasset=((XnatAbstractprojectasset)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("abstractProjectAsset")));
				return _Abstractprojectasset;
			}else {
				return _Abstractprojectasset;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for abstractProjectAsset.
	 * @param v Value to Set.
	 */
	public void setAbstractprojectasset(ItemI v) throws Exception{
		_Abstractprojectasset =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/abstractProjectAsset",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/abstractProjectAsset",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * abstractProjectAsset
	 * set org.nrg.xdat.model.XnatAbstractprojectassetI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractprojectassetI> void setAbstractprojectasset(A item) throws Exception{
	setAbstractprojectasset((ItemI)item);
	}

	/**
	 * Removes the abstractProjectAsset.
	 * */
	public void removeAbstractprojectasset() {
		_Abstractprojectasset =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/abstractProjectAsset",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	//FIELD

	private String _Example=null;

	/**
	 * @return Returns the example.
	 */
	public String getExample(){
		try{
			if (_Example==null){
				_Example=getStringProperty("example");
				return _Example;
			}else {
				return _Example;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for example.
	 * @param v Value to Set.
	 */
	public void setExample(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/example",v);
		_Example=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.ExProjectmetadata> getAllExProjectmetadatas(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExProjectmetadata> al = new ArrayList<org.nrg.xdat.om.ExProjectmetadata>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExProjectmetadata> getExProjectmetadatasByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExProjectmetadata> al = new ArrayList<org.nrg.xdat.om.ExProjectmetadata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExProjectmetadata> getExProjectmetadatasByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExProjectmetadata> al = new ArrayList<org.nrg.xdat.om.ExProjectmetadata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ExProjectmetadata getExProjectmetadatasById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("ex:projectMetadata/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (ExProjectmetadata) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
			else
				 return null;
		} catch (IllegalAccessException e) {
			final StackTraceElement[] stacktrace = e.getStackTrace();
			final String location = stacktrace == null || stacktrace.length == 0 ? "Unknown (no stack trace)" : stacktrace[0].toString();
			logger.error("The user " + user.getUsername() + " was denied access to the ex:projectMetadata/id instance with ID " + value + ". Occurred at: " + location + "\n" + e.getMessage());
		} catch (Exception e) {
			logger.error("",e);
		}

		return null;
	}

	public static ArrayList wrapItems(ArrayList items)
	{
		ArrayList al = new ArrayList();
		al = org.nrg.xdat.base.BaseElement.WrapItems(items);
		al.trimToSize();
		return al;
	}

	public static ArrayList wrapItems(org.nrg.xft.collections.ItemCollection items)
	{
		return wrapItems(items.getItems());
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //abstractProjectAsset
	        XnatAbstractprojectasset childAbstractprojectasset = (XnatAbstractprojectasset)this.getAbstractprojectasset();
	            if (childAbstractprojectasset!=null){
	              for(ResourceFile rf: ((XnatAbstractprojectasset)childAbstractprojectasset).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("abstractProjectAsset[" + ((XnatAbstractprojectasset)childAbstractprojectasset).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("abstractProjectAsset/" + ((XnatAbstractprojectasset)childAbstractprojectasset).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	return _return;
}
}
