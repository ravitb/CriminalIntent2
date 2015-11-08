package com.ravit.android.criminalintent2;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ravit on 05/11/15.
 */
public class Crime {

	private String mTitle;
	private UUID mId;
	private Date mDate;
	private Boolean mSolved;

	public Crime() {
		mId = UUID.randomUUID();
		mDate = new Date();
	}

	public Date getDate() {
		return mDate;
	}

	public void setDate(Date date) {
		mDate = date;
	}

	public Boolean isSolved() {
		return mSolved;
	}

	public void setSolved(Boolean solved) {
		mSolved = solved;
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
