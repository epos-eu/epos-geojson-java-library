package org.epos.library.style;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.logging.Logger;

import com.google.gson.annotations.SerializedName;

public class EposStyleItem {

	private static final Logger LOGGER = Logger.getGlobal();

	@SerializedName(value = "defaultName")
	private EposStyleObject styleName;
	
	
	private transient String name;

	public EposStyleItem(String name) {
		this.name = name;

		try {
			Field f  = this.getClass().getDeclaredField("styleName");
			final SerializedName fieldAnnotation = f.getAnnotation(com.google.gson.annotations.SerializedName.class);
			Object handler = Proxy.getInvocationHandler(fieldAnnotation);
			f.setAccessible(true);

			Field memberValues = handler.getClass().getDeclaredField("memberValues");
			memberValues.setAccessible(true);

			@SuppressWarnings("unchecked")
			Map<String,String> maps = (Map<String, String>) memberValues.get(handler);
			maps.remove("value");
			maps.put("value", name);

			memberValues.set(handler, maps);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			LOGGER.severe("A problem was encountered while overriding annotation or reading field "+e);
		} 
	}

	public EposStyleObject getStyleName() {
		return styleName;
	}

	public void setStyleName(EposStyleObject styleName) {
		this.styleName = styleName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EposStyle [styleName=" + styleName + "]";
	}

}
