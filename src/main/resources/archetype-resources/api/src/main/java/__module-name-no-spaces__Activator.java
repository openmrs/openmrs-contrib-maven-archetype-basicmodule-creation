/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package ${package};

#if( ${moduleActivatorManagement} == "y" || ${moduleActivatorManagement} == "Y" )
	#set( $activator = "Activator" )
	#set( $extendsOrImplements = "implements")
#else
	#set ($activator = "BaseModuleActivator")
	#set( $extendsOrImplements = "extends")
#end

import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.${activator};

/**
 * This class contains the logic that is run every time this module is either started or stopped.
 */
public class ${module-name-no-spaces}Activator ${extendsOrImplements} ${activator} {
	
	protected Log log = LogFactory.getLog(getClass());
	#if(${activator.equals("Activator")})
	
	/**
	 * @see Activator#startup()
	 */
	public void startup() {
		log.info("Starting ${module-name}");
	}
	
	/**
	 * @see Activator#shutdown()
	 */
	public void shutdown() {
		log.info("Shutting down ${module-name}");
	}
	
	#else
	
	/**
	 * @see BaseModuleActivator#willRefreshContext()
	 */
	public void willRefreshContext() {
		log.info("Refreshing ${module-name}");
	}
	
	/**
	 * @see BaseModuleActivator#contextRefreshed()
	 */
	public void contextRefreshed() {
		log.info("${module-name} refreshed");
	}
	
	/**
	 * @see BaseModuleActivator#willStart()
	 */
	public void willStart() {
		log.info("Starting ${module-name}");
	}
	
	/**
	 * @see BaseModuleActivator#started()
	 */
	public void started() {
		log.info("${module-name} started");
	}
	
	/**
	 * @see BaseModuleActivator#willStop()
	 */
	public void willStop() {
		log.info("Stopping ${module-name}");
	}
	
	/**
	 * @see BaseModuleActivator#stopped()
	 */
	public void stopped() {
		log.info("${module-name} stopped");
	}
	#end
	
}
