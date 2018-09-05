package com.dci.importcsv.beans.MS;

public class XlsReaderMS {
	
	private StringBuffer addTableStartTemplate(String tableType, String tableRender){
		System.out.println("Inside XmlReaderMS");
		StringBuffer startTableTemplate = new StringBuffer();
		startTableTemplate.append("<table render=\""+tableRender+"\" datatype=\"2\" tabletype=\"");
		startTableTemplate.append(tableType);

		startTableTemplate.append("\" rows=\"");
		startTableTemplate.append("rowSize");
		startTableTemplate.append("\" cols=\"");
		startTableTemplate.append("colSize");

		startTableTemplate.append("\" primary=\"\">");
		startTableTemplate.append("<tbody>");
		return startTableTemplate;
	}

}
