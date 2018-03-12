package com.joshua.voice.wafer.tunnel;

import com.joshua.voice.wafer.ConfigurationException;
import com.joshua.voice.wafer.ConfigurationManager;
import com.joshua.voice.wafer.Hash;

class TunnelClient {
	private static String _id = null;
	public static String getId() throws ConfigurationException {
		if (_id == null) {
			_id = Hash.md5(ConfigurationManager.getCurrentConfiguration().getServerHost());
		}
		return _id;
	}
	
	public static String getKey() throws ConfigurationException {
		return ConfigurationManager.getCurrentConfiguration().getTunnelSignatureKey();
	}
}
