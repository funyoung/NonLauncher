package com.android.common;

/**
 * Created with IntelliJ IDEA.
 * User: b608
 * Date: 13-4-1
 * Time: 下午6:07
 * To change this template use File | Settings | File Templates.
 */
// duplicate from com.android.common.Search
public class Search {
    /**
     * Key for the source identifier set by the application that launched a search intent.
     * The identifier is search-source specific string. It can be used
     * by the search provider to keep statistics of where searches are started from.
     *
     * The source identifier is stored in the {@link android.app.SearchManager#APP_DATA}
     * Bundle in {@link android.content.Intent#ACTION_SEARCH} and
     * {@link android.content.Intent#ACTION_WEB_SEARCH} intents.
     */
    public final static String SOURCE = "source";
}
