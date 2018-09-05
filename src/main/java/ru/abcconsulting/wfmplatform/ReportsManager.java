package ru.abcconsulting.wfmplatform;

import java.util.*;
import org.apache.log4j.*;

/// Tutorials: 
/// 1) https://technicalmumbojumbo.wordpress.com/2014/01/10/mule-esb-tutorial-series-an-introduction/
///
/// See https://docs.mulesoft.com/mule4-user-guide/v/4.1/intro-java-integration
/// and
/// https://docs.mulesoft.com/connectors/java-invoke-method
/// and
/// https://dzone.com/articles/mule-40-new-java-module
/// for how to invoke Java code
///
public class ReportsManager {
     public ReportsManager() {
    	 BasicConfigurator.configure();
    	 _logger.info("Reports manager instantation");
     }
     
     ///
     /// data are going through transform message component:
     /// https://docs.mulesoft.com/mule4-user-guide/v/4.1/transform-component-about
     /// messageBody is string representation of HTTP Request
     ///
     /// must receive specialized Object, representing report Job parameters
     public String generateReport(String params) {
    	 try {
    	     showStateImpl("Started");
    	     /* todo: umv: generate report implementation via service call
    	        or some other way 
    	      */
    	     showStateImpl("Succeseeded");
    	 }
    	 catch (Exception e) {
    		 showStateImpl("Failed");
    	 }
    	 finally {
    		 showStateImpl("Finished");		
    	 } 
    	 // todo: umv: providing some result, return Object or JSON
    	 return "generate report finished";
     }
     
     private void showStateImpl(String state) {
    	 String message = String.format(STATE_MESSAGE_TEMPLATE, new Object[] {state});
    	 _logger.info(message);
    	 //System.out.printf(STATE_MESSAGE_TEMPLATE, new Object[] {state});
     }
     
     private static final String STATE_MESSAGE_TEMPLATE = "Current state is: %s";
     private Logger _logger = LogManager.getLogger(ReportsManager.class);
}
