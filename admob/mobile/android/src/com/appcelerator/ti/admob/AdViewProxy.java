/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.appcelerator.ti.admob;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.util.TiConfig;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

// This proxy can be created by calling TiAdmob.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule=TiAdmobModule.class)
public class AdViewProxy extends TiViewProxy
{
	// Standard Debugging variables
	private static final String LCAT = "ExampleProxy";
	private static final boolean DBG = TiConfig.LOGD;
	private TiAdmobAdView adView;
	
	// Constructor
	public AdViewProxy(TiContext tiContext) {
		super(tiContext);
	}
	
	// Handle creation options
	@Override
	public void handleCreationDict(KrollDict options) {
		super.handleCreationDict(options);
	}

	@Override
	public TiUIView createView(Activity activity) {
		adView = new TiAdmobAdView(this);
		return adView;
	}

	@Kroll.method
	public void loadAd() {
	    adView.loadAd();
	}
}