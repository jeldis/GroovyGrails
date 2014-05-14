import static org.junit.Assert.*;
 
import org.junit.Before;
import org.junit.Test;
 
class TwitterValueTest {
    TwitterFollowerValue tv
 
    @Before
    public void setUp() throws Exception {
        tv = new TwitterFollowerValue()
    }
 
    @Test
    public void testCountFriendsAndFollowers() {
        def (friendsCount,followersCount) = tv.countFriendsAndFollowers('jeldisapp')
        assertEquals 90, friendsCount
        assertEquals 108, followersCount
    }
 
    @Test
    public void testGetTFV() {
        assertEquals 1.2, tv.getTFV('jeldisapp'), 0.0001
    }
}