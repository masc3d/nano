package com.leansoft.nano.impl;

import com.leansoft.nano.util.FastStack;

/**
 * Helper class for XmlReader
 * 
 * @author bulldog
 *
 */
class XmlReaderHelper {

   public XmlReaderHelper(Class<?> bindClazz)
   {
      this.bindClazz = bindClazz;
   }
	
	public int depth = 0;
   
   public Object bindObject = null;
   
	public StringBuilder textBuilder = new StringBuilder();
	
	public FastStack<Object> valueStack = new FastStack<Object>(5);
   
   public Class<?> bindFaultClazz;
   public Class<?> bindClazz;
   
	public boolean isRoot() {
		return valueStack.size() == 1 && depth == 1;
	}
	
	public void clearTextBuffer() {
		int length = textBuilder.length();
		this.textBuilder.delete(0, length);
	}
}
