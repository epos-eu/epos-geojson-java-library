package org.epos.library.objects;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ObjectToHTMLTable {

	public static String map(JsonElement json) {

		if(json.isJsonNull()) return "";

		if(json.isJsonPrimitive()) return json.getAsString();

		String tableContent = "<table>";
		if(json.isJsonArray()) {
			for(JsonElement obj: json.getAsJsonArray()) {
				tableContent+=tablePopulate(obj.getAsJsonObject());
			}

		}else {
			tableContent+=tablePopulate(json.getAsJsonObject());

		}
		tableContent += "</table>";

		return tableContent;
	}

	public static String tablePopulate(JsonObject json) {

		StringBuilder body = new StringBuilder();
		for(String key : json.keySet()) {
			body.append("<tr><td>");
			body.append(key);
			body.append("</td>");
			if(json.get(key).isJsonPrimitive()) {
				body.append("<td>");
				body.append(json.get(key).getAsString());
				body.append("</td>");
			}
			if(json.get(key).isJsonObject()){
				body.append("<td>");
				body.append(tablePopulate(json.get(key).getAsJsonObject()));
				body.append("</td>");
			}
			if(json.get(key).isJsonArray()){
				for(JsonElement jo : json.get(key).getAsJsonArray()) {
					try {
					body.append("<td>");
					body.append(tablePopulate(jo.getAsJsonObject()));
					body.append("</td>");
					}catch(IllegalStateException ise) {
						body.append("<td>");
						body.append(jo.toString());
						body.append("</td>");
					}
				}
			}
			body.append("</tr>");
		}

		return body.toString();
	}

}
