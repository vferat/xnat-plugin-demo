/*
 * GENERATED FILE
 *
 */
package org.nrg.xdat.om.base;
import org.nrg.xdat.om.base.auto.*;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;

import java.util.*;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE HERE
 *
 * TO MODIFY, COPY THIS FILE to src/main/java/org/nrg/xdat/om/base/ and modify it there 
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class BaseExProjectmetadata extends AutoExProjectmetadata {

	public BaseExProjectmetadata(ItemI item)
	{
		super(item);
	}

	public BaseExProjectmetadata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseExProjectmetadata(UserI user)
	 **/
	public BaseExProjectmetadata()
	{}

	public BaseExProjectmetadata(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
