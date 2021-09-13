package com.marcio.urlshorte;

import java.util.HashMap;
import java.util.Map;

public class ShortenUrl {
	
private Map<String, ShortenUrl> shortenUrlList = new HashMap<>();
	
private String full_url; //modificador private para URL orignal "completo'
private String short_url;//modificador private para URL curto

public String getFull_url() {
	return full_url;
}

public void setFull_url(String full_url) {
	this.full_url = full_url;
}

public String getShort_url() {
	return short_url;
}

public void setShort_url(String short_url) {
	this.short_url = short_url;
}

public Map<String, ShortenUrl> getShortenUrlList() {
	return shortenUrlList;
}

public void setShortenUrlList(Map<String, ShortenUrl> shortenUrlList) {
	this.shortenUrlList = shortenUrlList;
}
}
