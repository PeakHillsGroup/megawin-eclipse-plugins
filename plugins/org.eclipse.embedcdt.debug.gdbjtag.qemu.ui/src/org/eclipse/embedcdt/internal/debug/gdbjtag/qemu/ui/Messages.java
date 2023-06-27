/*******************************************************************************
 *  Copyright (c) 2008 QNX Software Systems and others.
 *
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *     QNX Software Systems - initial API and implementation
 *     Liviu Ionescu - Arm version
 *     Liviu Ionescu - UI part extraction.
 *******************************************************************************/

package org.eclipse.embedcdt.internal.debug.gdbjtag.qemu.ui;

import org.eclipse.osgi.util.NLS;

public class Messages {

	// ------------------------------------------------------------------------

	private static final String MESSAGES = "org.eclipse.embedcdt.internal.debug.gdbjtag.qemu.ui.messages"; //$NON-NLS-1$

	public static String DebuggerTab_disableGraphics_Text;
	public static String DebuggerTab_disableGraphics_ToolTipText;
	public static String DebuggerTab_doStartGdbServer_Text;
	public static String DebuggerTab_doStartGdbServer_ToolTipText;
	public static String DebuggerTab_enableSemihosting_Text;
	public static String DebuggerTab_enableSemihosting_ToolTipText;
	public static String DebuggerTab_gdbCommand_Label;
	public static String DebuggerTab_gdbCommand_ToolTipText;
	public static String DebuggerTab_gdbCommandActualPath_Label;
	public static String DebuggerTab_gdbCommandBrowse_Title;
	public static String DebuggerTab_gdbCommandBrowse;
	public static String DebuggerTab_gdbCommandVariable;
	public static String DebuggerTab_gdbOtherCommands_Label;
	public static String DebuggerTab_gdbOtherCommands_ToolTipText;
	public static String DebuggerTab_gdbOtherOptions_Label;
	public static String DebuggerTab_gdbOtherOptions_ToolTipText;
	public static String DebuggerTab_gdbSemihostingCmdline_Label;
	public static String DebuggerTab_gdbSemihostingCmdline_ToolTipText;
	public static String DebuggerTab_gdbServerActualPath_Label;
	public static String DebuggerTab_gdbServerActualPath_link;
	public static String DebuggerTab_gdbServerAllocateConsole_Label;
	public static String DebuggerTab_gdbServerAllocateConsole_ToolTipText;
	public static String DebuggerTab_gdbServerBoard_Label;
	public static String DebuggerTab_gdbServerBoard_ToolTipText;
	public static String DebuggerTab_gdbServerCPU_Label;
	public static String DebuggerTab_gdbServerCPU_ToolTipText;
	public static String DebuggerTab_gdbServerDelay_Label;
	public static String DebuggerTab_gdbServerDelay_ToolTipText;
	public static String DebuggerTab_gdbServerDevice_Label;
	public static String DebuggerTab_gdbServerDevice_ToolTipText;
	public static String DebuggerTab_gdbServerExecutable_Label;
	public static String DebuggerTab_gdbServerExecutable_ToolTipText;
	public static String DebuggerTab_gdbServerExecutableBrowse_Title;
	public static String DebuggerTab_gdbServerExecutableBrowse;
	public static String DebuggerTab_gdbServerExecutableVariable;
	public static String DebuggerTab_gdbServerGdbPort_Label;
	public static String DebuggerTab_gdbServerGdbPort_ToolTipText;
	public static String DebuggerTab_gdbServerGroup_Text;
	public static String DebuggerTab_gdbServerLog_Label;
	public static String DebuggerTab_gdbServerLogBrowse_Button;
	public static String DebuggerTab_gdbServerLogBrowse_Title;
	public static String DebuggerTab_gdbServerMachine_Label;
	public static String DebuggerTab_gdbServerMachine_ToolTipText;
	public static String DebuggerTab_gdbServerOther_Label;
	public static String DebuggerTab_gdbServerOther_ToolTipText;
	public static String DebuggerTab_gdbServerPreferXpacksBin_Label;
	public static String DebuggerTab_gdbServerPreferXpacksBin_ToolTipText;
	public static String DebuggerTab_gdbServerVerbose_Label;
	public static String DebuggerTab_gdbServerVerbose_ToolTipText;
	public static String DebuggerTab_gdbSetupGroup_Text;
	public static String DebuggerTab_interfaceGroup_Text;
	public static String DebuggerTab_ipAddressLabel;
	public static String DebuggerTab_ipAddressWarningDecoration;
	public static String DebuggerTab_portNumberLabel;
	public static String DebuggerTab_portNumberWarningDecoration;
	public static String DebuggerTab_remoteGroup_Text;
	public static String DebuggerTab_restoreDefaults_Link;
	public static String DebuggerTab_restoreDefaults_ToolTipText;
	public static String DebuggerTab_update_thread_list_on_suspend_Text;
	public static String DebuggerTab_update_thread_list_on_suspend_ToolTipText;
	public static String GDBJtagDebuggerTab_commandFactoryLabel;
	public static String GDBJtagDebuggerTab_connectionLabel;
	public static String GDBJtagDebuggerTab_gdbCommandBrowse_Title;
	public static String GDBJtagDebuggerTab_gdbCommandBrowse;
	public static String GDBJtagDebuggerTab_gdbCommandLabel;
	public static String GDBJtagDebuggerTab_gdbCommandVariable;
	public static String GDBJtagDebuggerTab_gdbSetupGroup_Text;
	public static String GDBJtagDebuggerTab_ipAddressLabel;
	public static String GDBJtagDebuggerTab_jtagDeviceLabel;
	public static String GDBJtagDebuggerTab_miProtocolLabel;
	public static String GDBJtagDebuggerTab_portNumberLabel;
	public static String GDBJtagDebuggerTab_remoteGroup_Text;
	public static String GDBJtagDebuggerTab_update_thread_list_on_suspend;
	public static String GDBJtagDebuggerTab_useRemote_Text;
	public static String GDBJtagDebuggerTab_verboseModeLabel;
	public static String GDBJtagStartupTab_doHalt_Text;
	public static String GDBJtagStartupTab_doReset_Text;
	public static String GDBJtagStartupTab_FileBrowse_Label;
	public static String GDBJtagStartupTab_FileBrowse_Message;
	public static String GDBJtagStartupTab_FileBrowseWs_Label;
	public static String GDBJtagStartupTab_FileBrowseWs_Message;
	public static String GDBJtagStartupTab_imageFileBrowse_Title;
	public static String GDBJtagStartupTab_imageFileBrowseWs_Title;
	public static String GDBJtagStartupTab_imageFileName_does_not_exist;
	public static String GDBJtagStartupTab_imageFileName_not_specified;
	public static String GDBJtagStartupTab_imageLabel_Text;
	public static String GDBJtagStartupTab_imageOffset_not_specified;
	public static String GDBJtagStartupTab_imageOffsetLabel_Text;
	public static String GDBJtagStartupTab_initGroup_Text;
	public static String GDBJtagStartupTab_loadGroup_Text;
	public static String GDBJtagStartupTab_loadImage_Text;
	public static String GDBJtagStartupTab_loadSymbols_Text;
	public static String GDBJtagStartupTab_pcRegister_not_specified;
	public static String GDBJtagStartupTab_runGroup_Text;
	public static String GDBJtagStartupTab_runOptionGroup_Text;
	public static String GDBJtagStartupTab_setPcRegister_Text;
	public static String GDBJtagStartupTab_setResume_Text;
	public static String GDBJtagStartupTab_setStopAt_Text;
	public static String GDBJtagStartupTab_stopAt_not_specified;
	public static String GDBJtagStartupTab_symbolsFileBrowse_Title;
	public static String GDBJtagStartupTab_symbolsFileBrowseWs_Title;
	public static String GDBJtagStartupTab_symbolsFileName_does_not_exist;
	public static String GDBJtagStartupTab_symbolsFileName_not_specified;
	public static String GDBJtagStartupTab_symbolsLabel_Text;
	public static String GDBJtagStartupTab_symbolsOffset_not_specified;
	public static String GDBJtagStartupTab_symbolsOffsetLabel_Text;
	public static String GDBJtagStartupTab_useFile_Label;
	public static String GDBJtagStartupTab_useProjectBinary_Label;
	public static String GDBJtagStartupTab_useProjectBinary_ToolTip;
	public static String GlobalMcuPagePropertyPage_description;
	public static String McuPage_executable_folder;
	public static String McuPage_executable_label;
	public static String ProjectMcuPagePropertyPage_description;
	public static String StartupTab_doContinue_Text;
	public static String StartupTab_doContinue_ToolTipText;
	public static String StartupTab_doDebugInRam_Text;
	public static String StartupTab_doDebugInRam_ToolTipText;
	public static String StartupTab_doFirstReset_Text;
	public static String StartupTab_doFirstReset_ToolTipText;
	public static String StartupTab_doSecondReset_Text;
	public static String StartupTab_doSecondReset_ToolTipText;
	public static String StartupTab_FileBrowse_Label;
	public static String StartupTab_FileBrowseWs_Label;
	public static String StartupTab_FileBrowseWs_Message;
	public static String StartupTab_imageFileBrowse_Title;
	public static String StartupTab_imageFileBrowseWs_Title;
	public static String StartupTab_imageFileName_does_not_exist;
	public static String StartupTab_imageFileName_not_specified;
	public static String StartupTab_imageOffset_not_specified;
	public static String StartupTab_imageOffsetLabel_Text;
	public static String StartupTab_initCommands_ToolTipText;
	public static String StartupTab_initGroup_Text;
	public static String StartupTab_loadGroup_Text;
	public static String StartupTab_loadImage_Text;
	public static String StartupTab_loadSymbols_Text;
	public static String StartupTab_pcRegister_not_specified;
	public static String StartupTab_pcRegister_ToolTipText;
	public static String StartupTab_runCommands_ToolTipText;
	public static String StartupTab_runGroup_Text;
	public static String StartupTab_runOptionGroup_Text;
	public static String StartupTab_secondResetWarning_Text;
	public static String StartupTab_setPcRegister_Text;
	public static String StartupTab_setPcRegister_ToolTipText;
	public static String StartupTab_setResume_Text;
	public static String StartupTab_setStopAt_Text;
	public static String StartupTab_setStopAt_ToolTipText;
	public static String StartupTab_stopAt_not_specified;
	public static String StartupTab_symbolsFileBrowse_Title;
	public static String StartupTab_symbolsFileBrowseWs_Title;
	public static String StartupTab_symbolsFileName_does_not_exist;
	public static String StartupTab_symbolsFileName_not_specified;
	public static String StartupTab_symbolsOffset_not_specified;
	public static String StartupTab_symbolsOffsetLabel_Text;
	public static String StartupTab_useFile_Label;
	public static String StartupTab_useProjectBinary_Label;
	public static String StartupTab_useProjectBinary_ToolTipText;
	public static String WorkspaceMcuPagePropertyPage_description;

	// ------------------------------------------------------------------------

	static {
		// initialise resource bundle
		NLS.initializeMessages(MESSAGES, Messages.class);
	}

	private Messages() {
	}

}
