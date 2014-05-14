/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jeldis.twitterclient
@Grab(group='org.twitter4j', module='twitter4j-core', version='4.0.1')

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.*;

import java.util.List;


String ACCESS_TOKEN = "2491716217-kqowsbZ176dBXR0FgXmOapPKaNWkECSjCJ97Ozn";
String ACCESS_TOKEN_SECRET = "224Tz26LcjP6RS4VbblP06HAo7kpSrsQ2q9GOtP7jwTIZ";
String CONSUMER_KEY = "9Jw1meiViH6PM0oaJ4mfrsrIY";
String CONSUMER_SECRET = "WgzFLHkYSyb67EEyvjucVgLbKDSMs2TP1tBlvkBhlHIRWRgRqW";

ConfigurationBuilder builder = new ConfigurationBuilder();
builder.setOAuthAccessToken(ACCESS_TOKEN);
builder.setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
builder.setOAuthConsumerKey(CONSUMER_KEY);
builder.setOAuthConsumerSecret(CONSUMER_SECRET);

OAuthAuthorization auth = new OAuthAuthorization(builder.build());

Twitter twitter = new TwitterFactory().getInstance(auth);

long cursor = -1;
IDs ids;
User user;

println("Listing following ids.");

ids = twitter.getFollowersIDs("keplerdiscovery", cursor);

String line;

def out = new File('UsuariosTwitter.log')

for (long id : ids.getIDs()) {

	user = twitter.showUser(id);
	
	line = id + " - " + user.getScreenName() + " - " + user.getScreenName()
	
	out.append line
	out.append '\n'
	
	println(id)

}