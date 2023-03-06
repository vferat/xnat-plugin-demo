/*
 * xnat-bids-plugin:
 * XNAT http://www.xnat.org
 * Copyright (c) 2023, Victor Férat
 * All Rights Reserved
 */

 package org.nrg.xnat.plugins.ex;

 import org.nrg.framework.annotations.XnatDataModel;
 import org.nrg.framework.annotations.XnatPlugin;
 import org.nrg.xdat.bean.ExProjectmetadataBean;
 
 @XnatPlugin(value = "exPlugin", name = "XNAT 1.8 eXplugin",
             dataModels = {@XnatDataModel(value = ExProjectmetadataBean.SCHEMA_ELEMENT_NAME,
                                         singular = "EX project data",
                                         plural = "EX project data",
                                         code = "EXPROJECTDATA")})

 public class ExXnatPlugin {
 }