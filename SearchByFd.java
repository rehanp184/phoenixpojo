package com.Phoenixpojo;

public class SearchByFd {

private String searchText;

public SearchByFd() {
}

public SearchByFd(String searchText) {
super();
this.searchText = searchText;
}

public String getSearchText() {
return searchText;
}

public void setSearchText(String searchText) {
this.searchText = searchText;
}

@Override
public String toString() {
	return "SearchByFd [searchText=" + searchText + ", getSearchText()=" + getSearchText() + "]";
}

}
