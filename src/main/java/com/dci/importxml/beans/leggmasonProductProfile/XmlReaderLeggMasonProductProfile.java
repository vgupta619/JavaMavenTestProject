package com.dci.importxml.beans.leggmasonProductProfile;

import java.util.Map;

public class XmlReaderLeggMasonProductProfile {
	
	private String getVarLangId(Map<String, Object> otherParamsForVariables, String locale)throws Exception{
		System.out.println(" Inside XmlReaderLeggMasonProductProfile");
        String entityLangId="";
        if(locale != null && !locale.trim().equals("")){
            Map languagesMap = (Map) otherParamsForVariables.get("languagesMap");
            if(languagesMap.containsKey(locale)){
                entityLangId = (String) languagesMap.get(locale);
            }else{
                if(languagesMap.containsKey("DEFAULT")){
                String defaultLanguage = (String) languagesMap.get("DEFAULT");
                entityLangId = (String) languagesMap.get(defaultLanguage);
                }
            }
        }
        return entityLangId;
    }

}
