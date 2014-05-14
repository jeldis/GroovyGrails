class TwitterFollowerValue {    
 
    def countFriendsAndFollowers(id) {
        def url = "http://api.twitter.com/1/users/show.xml?id=$id"
        def response = new XmlSlurper().parse(url)
        [response.friends_count,response.followers_count]*.toInteger()
    }
 
    def getTFV(id) {
        def (numFriends,numFollowers) = countFriendsAndFollowers(id)
        numFollowers / numFriends
    }
}