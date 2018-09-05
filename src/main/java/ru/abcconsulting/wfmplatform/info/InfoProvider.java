package ru.abcconsulting.wfmplatform.info;

/*
 *  Do not forger to export class (https://profit-online.pl/2018/03/mule-4-new-java-module/)
 * */
public class InfoProvider {
   public InfoProvider() {
	   
   }
   
   public static String getApiVersion() {
	   // todo: i.e. implement getting version from 
	   return API_VERSION;
   }
   
   private static final String API_VERSION ="v1.0";
}
