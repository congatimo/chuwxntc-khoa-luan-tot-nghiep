package chuwxntc.wikilookup;

import android.os.Bundle;
import org.apache.cordova.*;

public class Wikilookup extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl(Config.getStartUrl());
	}
}
