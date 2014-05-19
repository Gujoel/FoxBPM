/**
 * Copyright 1996-2014 FoxBPM ORG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author ych
 */
package org.foxbpm.rest.server;

import org.foxbpm.rest.service.application.FoxbpmRestApplication;
import org.restlet.Component;
import org.restlet.data.Protocol;

/**
 * 将rest作为独立java应用程序时的服务器端
 * 主要用于测试
 * @author ych
 *
 */
public class FoxbpmRestServer {

	public static void main(String[] args) throws Exception {
		
		 Component component = new Component();
		 component.getServers().add(Protocol.HTTP, 8082);
		 component.getDefaultHost().attach(new FoxbpmRestApplication());
		 component.start();     
		 System.out.println("The restlet server started ...");
	}
}
