/*
 * GENERATED FILE
 * Created on Mon Mar 06 11:28:15 CET 2023
 *
 */

/**
 * @author XDAT
 *
 */

function ex_projectMetadata(){
this.xsiType="ex:projectMetadata";

	this.getSchemaElementName=function(){
		return "projectMetadata";
	}

	this.getFullSchemaElementName=function(){
		return "ex:projectMetadata";
	}
this.extension=dynamicJSLoad('xnat_abstractProjectAsset','generated/xnat_abstractProjectAsset.js');

	this.Example=null;


	function getExample() {
		return this.Example;
	}
	this.getExample=getExample;


	function setExample(v){
		this.Example=v;
	}
	this.setExample=setExample;


	this.getProperty=function(xmlPath){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="abstractProjectAsset"){
				return this.Abstractprojectasset ;
			} else 
			if(xmlPath.startsWith("abstractProjectAsset")){
				xmlPath=xmlPath.substring(20);
				if(xmlPath=="")return this.Abstractprojectasset ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Abstractprojectasset!=undefined)return this.Abstractprojectasset.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="example"){
				return this.Example ;
			} else 
			if(xmlPath=="meta"){
				return this.Meta ;
			} else 
			{
				return this.extension.getProperty(xmlPath);
			}
	}


	this.setProperty=function(xmlPath,value){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="abstractProjectAsset"){
				this.Abstractprojectasset=value;
			} else 
			if(xmlPath.startsWith("abstractProjectAsset")){
				xmlPath=xmlPath.substring(20);
				if(xmlPath=="")return this.Abstractprojectasset ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Abstractprojectasset!=undefined){
					this.Abstractprojectasset.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Abstractprojectasset= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Abstractprojectasset= instanciateObject("xnat:abstractProjectAsset");//omUtils.js
						}
						if(options && options.where)this.Abstractprojectasset.setProperty(options.where.field,options.where.value);
						this.Abstractprojectasset.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="example"){
				this.Example=value;
			} else 
			if(xmlPath=="meta"){
				this.Meta=value;
			} else 
			{
				return this.extension.setProperty(xmlPath,value);
			}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.setReferenceField=function(xmlPath,v) {
			this.extension.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.getReferenceFieldName=function(xmlPath) {
			return this.extension.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	this.getFieldType=function(xmlPath){
		if (xmlPath=="example"){
			return "field_data";
		}
		else{
			return this.extension.getFieldType(xmlPath);
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<ex:exprojectMetadata";
		xmlTxt+=this.getXMLAtts();
		xmlTxt+=" xmlns:arc=\"http://nrg.wustl.edu/arc\"";
		xmlTxt+=" xmlns:cat=\"http://nrg.wustl.edu/catalog\"";
		xmlTxt+=" xmlns:ex=\"test/ex\"";
		xmlTxt+=" xmlns:icr=\"http://icr.ac.uk/icr\"";
		xmlTxt+=" xmlns:pipe=\"http://nrg.wustl.edu/pipe\"";
		xmlTxt+=" xmlns:prov=\"http://www.nbirn.net/prov\"";
		xmlTxt+=" xmlns:scr=\"http://nrg.wustl.edu/scr\"";
		xmlTxt+=" xmlns:val=\"http://nrg.wustl.edu/val\"";
		xmlTxt+=" xmlns:wrk=\"http://nrg.wustl.edu/workflow\"";
		xmlTxt+=" xmlns:xdat=\"http://nrg.wustl.edu/security\"";
		xmlTxt+=" xmlns:xnat=\"http://nrg.wustl.edu/xnat\"";
		xmlTxt+=" xmlns:xnat_a=\"http://nrg.wustl.edu/xnat_assessments\"";
		xmlTxt+=" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"";
		xmlTxt+=">";
		xmlTxt+=this.getXMLBody(preventComments)
		xmlTxt+="\n</ex:exprojectMetadata>";
		return xmlTxt;
	}


	this.getXMLComments=function(preventComments){
		var str ="";
		if((preventComments==undefined || !preventComments) && this.hasXMLComments()){
		}
		return str;
	}


	this.getXMLAtts=function(){
		var attTxt = this.extension.getXMLAtts();
		return attTxt;
	}


	this.getXMLBody=function(preventComments){
		var xmlTxt=this.getXMLComments(preventComments);
		xmlTxt+=this.extension.getXMLBody(preventComments);
		if (this.Example!=null){
			xmlTxt+="\n<ex:example";
			xmlTxt+=">";
			xmlTxt+=this.Example.replace(/>/g,"&gt;").replace(/</g,"&lt;");
			xmlTxt+="</ex:example>";
		}
		return xmlTxt;
	}


	this.hasXMLComments=function(){
	}


	this.hasXMLBodyContent=function(){
		if (this.Example!=null) return true;
		if(this.hasXMLComments())return true;
		if(this.extension.hasXMLBodyContent())return true;
		return false;
	}
}
