package org.product.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.product.web.bean.ConfigDetails;


/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class ConfigDetailsService {

 static HashMap<Integer,ConfigDetails> configDetailsIdMap=getConfigDetailsIdMap();


 public ConfigDetailsService() {
  super();

  if(configDetailsIdMap==null)
  {
	  configDetailsIdMap=new HashMap<Integer,ConfigDetails>();
  // Creating some objects of Country while initializing
   ConfigDetails hpProductConfig=new ConfigDetails(1,"Intel Pentium 3","500GB","8GB","15 Inch","Windows 10");
   ConfigDetails dellProductConfig=new ConfigDetails(2,"Intel Pentium 5","1TB","16GB","17 Inch","Windows 7");
   ConfigDetails lenovoProductConfig=new ConfigDetails(3,"Intel Pentium 7","500GB","4GB","12 Inch","Windows 10");
   ConfigDetails appleProductConfig=new ConfigDetails(4,"Intel Pentium 5","500GB","8GB","15 Inch","IOS");
  
   configDetailsIdMap.put(1,hpProductConfig);
   configDetailsIdMap.put(2,dellProductConfig);
   configDetailsIdMap.put(3,lenovoProductConfig);
   configDetailsIdMap.put(4,appleProductConfig);
  }
 }

 public List<ConfigDetails> getAllConfigDetails()
 {
  List<ConfigDetails> configDetails = new ArrayList<ConfigDetails>(configDetailsIdMap.values());
  return configDetails;
 }

 public ConfigDetails getConfigDetails(int id)
 {
	 ConfigDetails configDetails= configDetailsIdMap.get(id);
    return configDetails;
 }
 public ConfigDetails addConfigDetails(ConfigDetails configdetails)
 {
	 configdetails.setProdId(getMaxId()+1);
	 configDetailsIdMap.put(configdetails.getProdId(), configdetails);
     return configdetails;
 }
 
 public ConfigDetails updateConfigDetails(ConfigDetails configdetails)
 {
  if(configdetails.getProdId()<=0)
   return null;
  configDetailsIdMap.put(configdetails.getProdId(), configdetails);
  return configdetails;

 }
 public void deleteConfigDetails(int id)
 {
	 configDetailsIdMap.remove(id);
 }

 public static HashMap<Integer, ConfigDetails> getConfigDetailsIdMap() {
  return configDetailsIdMap;
 }
 

 // Utility method to get max id
 public static int getMaxId()
 {   int max=0;
 for (int id:configDetailsIdMap.keySet()) {  
  if(max<=id)
   max=id;

 }  
 return max;
 }
}

