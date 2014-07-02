package com.google.devrel.training.conference.form;

/**
 * Pojo representing a profile form on the client side.
 */
public class ProfileForm {
	/**
	 * Any string user wants us to display him/her on this system.
	 */
	private String displayName;
	private TeeShirtSize teeShirtSize;

	private ProfileForm() {
	}

	public ProfileForm(String displayName, TeeShirtSize teeShirtSize) {
		this.displayName = displayName;
		this.teeShirtSize = teeShirtSize;
	}

	public String getDisplayName() {
		return displayName;
	}

	public TeeShirtSize getTeeShirtSize() {
		return teeShirtSize;
	}

	public static enum TeeShirtSize {
		NOT_SPECIFIED, XS, S, M, L, XL, XXL, XXXL
	}
}
