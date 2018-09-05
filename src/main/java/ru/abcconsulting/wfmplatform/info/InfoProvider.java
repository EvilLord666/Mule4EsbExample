package ru.abcconsulting.wfmplatform.info;

public class InfoProvider {
   public InfoProvider() {
	   
   }
   
   public static String getApiVersion() {
	   // todo: i.e. implement getting version from 
	   return API_VERSION;
   }
   
   private static final String API_VERSION ="v1.0";
}
