/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by 
 * Appcelerator. It should not be modified by hand.
 */
package com.codeboxed.recordaudio;

import org.mozilla.javascript.Scriptable;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollModuleInfo;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public final class RecordAudioTestApplication extends TiApplication {

	@Override
	public void onCreate() {
		super.onCreate();
		
		appInfo = new RecordAudioTestAppInfo(this);
		postAppInfo();
		stylesheet = new ApplicationStylesheet();
		postOnCreate();
	}
	
	@Override
	protected void bootModules(TiContext context) {
		// XML module
		modules.add(new ti.modules.titanium.xml.XMLModule(context));
		// Locale module
		modules.add(new ti.modules.titanium.locale.LocaleModule(context));
		// Media module
		modules.add(new ti.modules.titanium.media.MediaModule(context));
		// App module
		modules.add(new ti.modules.titanium.app.AppModule(context));
		// Analytics module
		modules.add(new ti.modules.titanium.analytics.AnalyticsModule(context));
		// JSON module
		modules.add(new ti.modules.titanium.json.JSONModule(context));
		// API module
		modules.add(new ti.modules.titanium.api.APIModule(context));
		// UI module
		modules.add(new ti.modules.titanium.ui.UIModule(context));
		// Filesystem module
		modules.add(new ti.modules.titanium.filesystem.FilesystemModule(context));
		// Android module
		modules.add(new ti.modules.titanium.android.AndroidModule(context));
		
		// Custom modules
		KrollModuleInfo moduleInfo;
		
		moduleInfo = new KrollModuleInfo(
			"audiorecorder", "com.codeboxed.audiorecorder", "747dce68-7d2d-426a-a527-7c67f4e9dfad", "0.1",
			"My module", "Your Name", "Specify your license",
			"Copyright (c) 2011 by Your Company");
		KrollModule.addModuleInfo(moduleInfo);
		org.appcelerator.titanium.TiVerify verify = new org.appcelerator.titanium.TiVerify(context.getActivity(), this);
		verify.verify();
		modules.add(new ti.modules.titanium.debug.DebugModule(context));
	}
	
	@Override
	public KrollModule requireModule(TiContext context, KrollModuleInfo info) {
		KrollModule module = super.requireModule(context, info);
		if (module != null) {
			return module;
		}
		
		String id = info.getId();
		if ("com.codeboxed.audiorecorder".equals(id)) {
			module = new com.codeboxed.audiorecorder.AudiorecorderModule(context);
		}
		
		if (module != null) {
			modules.add(module);
			return module;
		}
		return null;
	}
}
