/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.team.build.internal.hjplugin;

/**
 * This class is used in the H/J plugin to hold information about
 * the build result (like how it was started and by whom).
 * The Facade will wrap it up within an IBuildResultInfo so that
 * the -rtc plugin can populate it appropriately. It can not implement
 * the IBuildResultInfo interface because it is within the -rtc plugin
 * and not accessible at this level.
 */
public class BuildResultInfo {
	
	private final String buildResultUUID;
	private boolean isPersonalBuild;
	private boolean isScheduled;
	private String requestor;
	
	public BuildResultInfo(String buildResultUUID) {
		this.buildResultUUID = buildResultUUID;
	}

	public String getBuildResultUUID() {
		return buildResultUUID;
	}

	public boolean isPersonalBuild() {
		return isPersonalBuild;
	}

	public void setPersonalBuild(boolean isPersonalBuild) {
		this.isPersonalBuild = isPersonalBuild;
	}

	public String getRequestor() {
		return requestor;
	}

	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}

	public boolean isScheduled() {
		return isScheduled;
	}

	public void setScheduled(boolean isScheduled) {
		this.isScheduled = isScheduled;
	}
}
