/*
 * GENERATED FILE
 * Created on Mon Mar 06 11:34:00 CET 2023
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface ExProjectmetadataI extends XnatAbstractprojectassetI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the example.
	 */
	public String getExample();

	/**
	 * Sets the value for example.
	 * @param v Value to Set.
	 */
	public void setExample(String v);
}