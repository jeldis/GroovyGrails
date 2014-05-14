@Grab(group='org.twitter4j', module='twitter4j-core', version='4.0.1')

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.*;

import java.util.List;


String ACCESS_TOKEN = "";
String ACCESS_TOKEN_SECRET = "";
String CONSUMER_KEY = "";
String CONSUMER_SECRET = "";

ConfigurationBuilder builder = new ConfigurationBuilder();
builder.setOAuthAccessToken(ACCESS_TOKEN);
builder.setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
builder.setOAuthConsumerKey(CONSUMER_KEY);
builder.setOAuthConsumerSecret(CONSUMER_SECRET);

OAuthAuthorization auth = new OAuthAuthorization(builder.build());

Twitter twitter = new TwitterFactory().getInstance(auth);

try {
	
	//twitter.updateStatus("Hello World!");
	
    List<Status> statuses = twitter.getHomeTimeline();
    System.out.println("Showing home timeline.");
    for (Status status : statuses) {
        System.out.println(status.getUser().getName() + ":" +
                           status.getText());
    }
	

} catch (Exception e) {
			System.err.println("Error occurred while updating the status!");
			println(e.getMessage())
			return;
}

println("Successfully updated the status.");