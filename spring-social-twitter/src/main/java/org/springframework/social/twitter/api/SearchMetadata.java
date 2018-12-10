package org.springframework.social.twitter.api;

/**
 * Represents the cursor metadata associated with a search query via the Twitter Search API.
 * @author Jeremy Appel
 */
public class SearchMetadata extends TwitterObject {
	
	private final long maxId;
	private final long sinceId;
	private final String maxIdStr;
	private final String sinceIdStr;

	public SearchMetadata(long maxId, long sinceId, String maxIdStr, String sinceIdStr) {
		this.maxId = maxId;
		this.sinceId = sinceId;
		this.maxIdStr = maxIdStr;
		this.sinceIdStr = sinceIdStr;
	}

	public long getMaxId() {
		return maxId;
	}

	public long getSinceId() {
		return sinceId;
	}

	public String getMaxIdStr() {
		return maxIdStr;
	}

	public String getSinceIdStr() {
		return sinceIdStr;
	}
}
