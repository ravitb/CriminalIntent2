package com.ravit.android.criminalintent2;

import java.util.UUID;

/**
 * Created by ravit on 05/11/15.
 */
public class Crime {

	private String mTitle;
	private UUID mId;

	public Crime() {
		mId = UUID.randomUUID();
	}

	public UUID getId() {
		return mId;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}
}
