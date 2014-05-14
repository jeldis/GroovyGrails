@Grab(group='org.twitter4j', module='twitter4j-core', version='4.0.1')

import java.io.IOException;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

String CONSUMER_KEY = "";
String CONSUMER_KEY_SECRET = "";

Twitter twitter = new TwitterFactory().getInstance();

twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_KEY_SECRET);

String accessToken = "";
String accessTokenSecret = "";

AccessToken oathAccessToken = new AccessToken(accessToken, accessTokenSecret);
twitter.setOAuthAccessToken(oathAccessToken);

twitter.updateStatus("Hi, im updating status again from Namex Tweet for Demo");

System.out.println("\nMy Timeline:");

ResponseList list = twitter.getHomeTimeline();
for (Status each : list) {
     System.out.println("Sent by: @" + each.getUser().getScreenName()
      + " - " + each.getUser().getName() + "\n" + each.getText()
      + "\n");
}

